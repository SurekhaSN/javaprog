public class StudentMarks{


int StudentPhy;
int StudentChem;
int StudentMaths;
int StudentBio;
byte TotalMarks;

public void StudentTotalMarks(int StuName,int StuId,int StuPhy,int StuChem,int StuMaths,int StuBio){


StudentPhy=StuPhy;
StudentChem=StuChem;
StudentMaths=StuMaths;
StudentBio=StuBio;



TotalMarks=StudentPhy+StudentChem+StudentMaths+StudentBio;

System.out.println("PhyMarks="+StudentPhy);
System.out.println("ChemMarks="+StudentChem);
System.out.println("MathsMarks="+StudentMaths);
System.out.println("BioMarks="+StudentBio);


}

}




