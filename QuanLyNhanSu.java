interface EmailSender {
    void sendEmail();
}
interface Programmer {
    void code();
}
interface Salesperson {
    void sell();
}

class OfficeEmployee implements EmailSender {
    private String ten;

    public OfficeEmployee(String ten) {
        this.ten = ten;
    }

    @Override 
    public void sendEmail() {
        System.out.println(ten + " (OfficeEmployee) đang gửi email...");
    }
}

class TechnicalEmployee implements EmailSender, Programmer {
    private String ten;

    public TechnicalEmployee(String ten) {
        this.ten= ten;
    }

    @Override
    public void sendEmail() {
        System.out.println(ten + " (TechnicalEmployee) đang gửi email...");
    }

    @Override
    public  void code() {
        System.out.println(ten + " (TechnicalEmployee) đang code...");
    }
}

class SalesEmployee implements EmailSender, Salesperson {
    private String ten;

    public SalesEmployee(String ten) {
        this.ten= ten;
    }

    @Override
    public void sendEmail() {
        System.out.println(ten + " (SalesEmployee) đang gửi email...");
    }

    @Override
    public  void sell() {
        System.out.println(ten + " (SalesEmployee) đang bán hàng...");
    }
}