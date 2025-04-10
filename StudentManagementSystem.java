class StudentManagementSystem{
    
    static int BITcount, BCScount , BCEcount, BTTcount, BECcount, BEEcount, BMEcount, BIEcount, BPRcount ;
    static int DSY_BITcount, DSY_BCScount, DSY_BCEcount, DSY_BTTcount, DSY_BECcount, DSY_BEEcount, DSY_BMEcount, DSY_BIEcount, DSY_BPRcount ;

    private static String dob;
    public static String name;
    public static int year;
    public static byte age;      
    private static String regNo;
    public static String branch;
    public static String BloodGroup;
    public static String DSYorRegular;
    
    public static void main(String args[]){
        if(args.length<5){
        System.out.println("Use : name dob year branch BloodGroup DSYorRegular");
        }
        for(int i = 0; i<=5; i++){
        String name = args[6*i];
        String dob = args[6*i+1];
        int year = Integer.parseInt(args[6*i+2]);
        String branch = args[6*i+3];
        String BloodGroup = args[6*i+4];
        String DSYorRegular = args[6*i+5];
        System.out.println();
        StudentManagementSystem s = new StudentManagementSystem(name, dob, year, branch, BloodGroup, DSYorRegular);
        s.displayData();
        }
       
        }

    StudentManagementSystem(String name, String dob, int year, String branch, String BloodGroup, String DSYorRegular){
        this.name = name;
        this.dob = dob;
        this.year = year;
        this.BloodGroup = BloodGroup;
        this.branch = branch;
        this.DSYorRegular = DSYorRegular;
        this.age = getAge(age);
        String branchCode = getBranchCode(branch);
        
        if(DSYorRegular.equalsIgnoreCase("regular")){
        
        String regCount = (getBranchCount(branch));
          this.regNo = year + branchCode +  regCount;
        }
        else if(DSYorRegular.equalsIgnoreCase("DSY")){
        int DSYregCount = 500+Integer.parseInt(getDSYBranchCount(branch));
        this.regNo = year + branchCode +  DSYregCount;
        
    }
    }
    
    public byte getAge(byte age){
        return (byte)(year - Integer.parseInt(dob.substring(6)));
    }

    public static String getBranchCode(String branch){
        if(branch.equalsIgnoreCase("IT")) return "BIT";
        else if(branch.equalsIgnoreCase("CS")) return "BCS";
        else if(branch.equalsIgnoreCase("CE")) return "BCE";
        else if(branch.equalsIgnoreCase("TT")) return "BTT";
        else if(branch.equalsIgnoreCase("EXTC")) return "BEC";
        else if(branch.equalsIgnoreCase("EE")) return "BEE";
        else if(branch.equalsIgnoreCase("ME")) return "BME";
        else if(branch.equalsIgnoreCase("IE")) return "BIE";
        else if(branch.equalsIgnoreCase("PRODUCTION")) return "BPR";
        else {
            return "This branch is not available here..!";    
        }
    }
    public static String getBranchCount(String branch){
        if(branch.equalsIgnoreCase("IT")) return String.format("%03d",++BITcount);
        else if(branch.equalsIgnoreCase("CS")) return String.format("%03d",++BCScount);
        else if(branch.equalsIgnoreCase("CE")) return String.format("%03d",++BCEcount);
        else if(branch.equalsIgnoreCase("TT")) return String.format("%03d",++BTTcount);
        else if(branch.equalsIgnoreCase("EXTC")) return String.format("%03d",++BECcount) ;
        else if(branch.equalsIgnoreCase("EE")) return String.format("%03d",++BEEcount);
        else if(branch.equalsIgnoreCase("ME")) return String.format("%03d",++BMEcount);
        else if(branch.equalsIgnoreCase("IE")) return String.format("%03d",++BIEcount);
        else if(branch.equalsIgnoreCase("PRODUCTION")) return String.format("%03d",++BPRcount);
        else {
            return "This branch is not available here..!";    
        }
    }
    
    public static String getDSYBranchCount(String branch){
        if(branch.equalsIgnoreCase("IT")) return String.valueOf(++DSY_BITcount);
        else if(branch.equalsIgnoreCase("CS")) return String.valueOf(++DSY_BCScount);
        else if(branch.equalsIgnoreCase("CE")) return String.valueOf(++DSY_BCEcount);
        else if(branch.equalsIgnoreCase("TT")) return String.valueOf(++DSY_BTTcount);
        else if(branch.equalsIgnoreCase("EXTC")) return String.valueOf(++DSY_BECcount) ;
        else if(branch.equalsIgnoreCase("EE")) return String.valueOf(++DSY_BEEcount);
        else if(branch.equalsIgnoreCase("ME")) return String.valueOf(++DSY_BMEcount);
        else if(branch.equalsIgnoreCase("IE")) return String.valueOf(++DSY_BIEcount);
        else if(branch.equalsIgnoreCase("PRODUCTION")) return String.valueOf(++DSY_BPRcount);
        else {
            return "This branch is not available here..!";    
        }
     }

        public static void displayData(){
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Year: " + year);
        System.out.println("Registration Number: " + regNo);
        System.out.println("dob: " + dob);
        System.out.println("Age: " + age);
        System.out.println("Blood Group: " + BloodGroup); 
    }
}

