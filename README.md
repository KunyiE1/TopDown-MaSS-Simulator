# Top-Down MaSS Simulator
Top-down MaSS Simulator is used for generating top-down deconvoluted CID mass spectrum. Which is modified based on MaSS-Simulator.
For original MaSS Simulator: https://github.com/pcdslab/MaSS-Simulator, \
and corresponding paper: https://pmc.ncbi.nlm.nih.gov/articles/PMC6400488/

The simulator can be easily used by running the **src/guitest/MaSS_Simulator.java**, which provides a graphical interface for users.
The manual and tutorial file are provided with the code. Here we emphasize some unique characteristics of our Top-down simulator.

**Ion types and IGP**:\
In our simulator, the ion types and IGP(Ion Generation Probability) are set and computed automatically (by clicking **Load Default** button on the GUI).\
We consider 3 types of C-type ions and 6 types of N-type ions. The IGP for each ion generated for different types of residue are computed according to the particular mean and variance we analysed beforehand.(the mean and variance can be found in **IGP data** folder).\
Since our tool focuses on generating top-down deconvoluted spectrum, multi-charge ions and immonium ions are not considered.

**Noise**:\
The number of noisy peaks in the simulated spectrum is automatically computed according to the relationship between the number of peaks and the precursor mass of the spectrum (the molecular mass of the input protein segment), which we analysed beforehand.

**output Format**:\
The original simulator output **.ms2** format file. We provide a python script **ms2tomsalign.py** for converting **.ms2** format to **.msalign** format file with corresponding **.feature** file.
