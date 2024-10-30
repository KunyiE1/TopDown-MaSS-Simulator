//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package guitest;

public class Ion {
    public double m_z;
    public double intensity;

    public Ion() {
        this.m_z = 0.0;
        this.intensity = 0.0;
    }

    public Ion(double m_zN, double intensityN) {
        this.m_z = m_zN;
        this.intensity = intensityN;
    }

    int compareTo(Ion myIon) {
        if (this.m_z > myIon.m_z) {
            return 1;
        } else {
            return this.m_z < myIon.m_z ? -1 : 0;
        }
    }
}

