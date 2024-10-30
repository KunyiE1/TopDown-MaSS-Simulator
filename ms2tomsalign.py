def toMsalign(file_name):
    sp_list = []
    f = open(file_name, encoding= 'utf-8')
    line = f.readline()
    while(line.strip()[0] == "H"):
        line = f.readline()
    scans = int(line.strip().split('\t')[1]) + int(line.strip().split('\t')[2])
    line = f.readline()
    prec_charge = int(line.strip().split('\t')[1])
    prec_mass = float(line.strip().split('\t')[2])
    prec_mz = round(prec_mass / prec_charge + 1.007276466879, 5)
    peaks = []
    line = f.readline()

    while line:
        if line.strip()[0] == "S":
            sp = {'ID': len(sp_list),
                  'FRACTION_ID': -1,
                  'FILE_NAME':'',
                  'SCANS':scans,
                  'RETENTION_TIME': -1,
                  'LEVEL': 2,
                  'ACTIVATION': "CID",
                  'MS_ONE_ID': -1,
                  'MS_ONE_SCAN': -1,
                  'PRECURSOR_MZ': prec_mz,
                  'PRECURSOR_CHARGE': prec_charge,
                  'PRECURSOR_MASS': prec_mass,
                  'PRECURSOR_INTENSITY': -1,
                  'PEAKS': peaks,
                  'Fraction_ID': -1,
                  'Fraction_feature_ID': -1,
                  'Fraction_feature_intensity': -1,
                  'Fraction_feature_score': -1,
                  'Sample_feature_ID': -1,
                  'Sample_feature_intensity': -1}
            sp_list.append(sp)
            scans = int(line.strip().split('\t')[1]) + int(line.strip().split('\t')[2])
            line = f.readline()
            prec_charge = float(line.strip().split('\t')[1])
            prec_mass = float(line.strip().split('\t')[2])
            prec_mz = round(prec_mass / prec_charge + 1.007276466879, 5)
            peaks = []
            line = f.readline()
        else:
            #if(float(line.strip().split(' ')[0]) - 1 < prec_mass):
            peakmass = float(line.strip().split(' ')[0])
            peaks.append(str(round(peakmass,5)) + ' ' + line.strip().split(' ')[1])
            line = f.readline()

    sp = {'ID': len(sp_list),
          'FRACTION_ID': -1,
          'FILE_NAME': '',
          'SCANS': scans,
          'RETENTION_TIME': -1,
          'LEVEL': 2,
          'ACTIVATION': "CID",
          'MS_ONE_ID': -1,
          'MS_ONE_SCAN': -1,
          'PRECURSOR_MZ': prec_mz,
          'PRECURSOR_CHARGE': prec_charge,
          'PRECURSOR_MASS': prec_mass,
          'PRECURSOR_INTENSITY': -1,
          'PEAKS': peaks,
          'Fraction_ID': -1,
          'Fraction_feature_ID': -1,
          'Fraction_feature_intensity': -1,
          'Fraction_feature_score': -1,
          'Sample_feature_ID': -1,
          'Sample_feature_intensity': -1}
    sp_list.append(sp)


    f_msalign = open(file_name[:-4] + "_ms2.msalign", 'w', encoding='utf-8')
    for i in range(len(sp_list)):
        f_msalign.write('BEGIN IONS\n')
        f_msalign.write("ID=" + str(sp_list[i]['ID']) + "\n")
        f_msalign.write("FRACTION_ID=" + str(sp_list[i]['FRACTION_ID']) + "\n")
        f_msalign.write("FILE_NAME=" + str(sp_list[i]['FILE_NAME']) + "\n")
        f_msalign.write("SCANS=" + str(sp_list[i]['SCANS']) + "\n")
        f_msalign.write("RETENTION_TIME=" + str(sp_list[i]['RETENTION_TIME']) + "\n")
        f_msalign.write("LEVEL=" + str(sp_list[i]['LEVEL']) + "\n")
        f_msalign.write("ACTIVATION=" + str(sp_list[i]['ACTIVATION']) + "\n")
        f_msalign.write("MS_ONE_ID=" + str(sp_list[i]['MS_ONE_ID']) + "\n")
        f_msalign.write("MS_ONE_SCAN=" + str(sp_list[i]['MS_ONE_SCAN']) + "\n")
        f_msalign.write("PRECURSOR_MZ=" + str(sp_list[i]['PRECURSOR_MZ']) + "\n")
        f_msalign.write("PRECURSOR_CHARGE=" + str(sp_list[i]['PRECURSOR_CHARGE']) + "\n")
        f_msalign.write("PRECURSOR_MASS=" + str(sp_list[i]['PRECURSOR_MASS']) + "\n")
        f_msalign.write("PRECURSOR_INTENSITY=" + str(sp_list[i]['PRECURSOR_INTENSITY']) + "\n")
        peak_list = sp_list[i]['PEAKS']
        for j in range(len(peak_list)):
            f_msalign.write(peak_list[j].split(' ')[0] + '\t')
            f_msalign.write(peak_list[j].split(' ')[1] + '\t')
            f_msalign.write('1' + '\n')
        f_msalign.write("END IONS\n")
        f_msalign.write('\n')
    f_msalign.close()

    f_feature = open(file_name[:-4] + "_ms2.feature", 'w', encoding='utf-8')
    f_feature.write("Spec_ID    Fraction_ID	File_name	Scans	MS_one_ID	MS_one_scans	Precursor_mass	Precursor_intensity	Fraction_feature_ID	Fraction_feature_intensity	Fraction_feature_score	Sample_feature_ID   Sample_feature_intensity")
    f_feature.write("\n")
    for i in range(len(sp_list)):
        f_feature.write(str(sp_list[i]['ID']) + "\t"
                        + str(sp_list[i]['FRACTION_ID']) + "\t"
                        + str(sp_list[i]['FILE_NAME']) + "\t"
                        + str(sp_list[i]['SCANS']) + "\t"
                        + str(sp_list[i]['MS_ONE_ID']) + "\t"
                        + str(sp_list[i]['MS_ONE_SCAN']) + "\t"
                        + str(sp_list[i]['PRECURSOR_MASS']) + "\t"
                        + str(sp_list[i]['PRECURSOR_INTENSITY']) + "\t"
                        + str(sp_list[i]['Fraction_feature_ID']) + "\t"
                        + str(sp_list[i]['Fraction_feature_intensity']) + "\t"
                        + str(sp_list[i]['Fraction_feature_score']) + "\t"
                        + str(sp_list[i]['Sample_feature_ID']) + "\t"
                        + str(sp_list[i]['Sample_feature_intensity']) + "\n")
    f_feature.close()

toMsalign("2000_sim/2000_sim.ms2")