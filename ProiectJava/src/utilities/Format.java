package utilities;

public enum Format {
    C("CD"),
    D("DVD"),
    B("BLURAY"),
    V("VINYL");

    private final String f;

    private Format(){
        this.f = "";
    }

    private Format(String f){
        this.f = f;
    }

    public String getFormat() {
        return f;
    }

    public char returnCharFormat(String diskFormat) {
        if(diskFormat.equals("CD")){
            return 'C';
        }else if(diskFormat.equals("DVD")){
            return 'D';
        }else if(diskFormat.equals("BLURAY")){
            return 'B';
        }else if(diskFormat.equals("VINYL")){
            return 'V';
        }
        return 0;
    }

}
