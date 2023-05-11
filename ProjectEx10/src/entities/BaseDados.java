package entities;

public class BaseDados {
    private Integer ID;
    private String Nome;
    private String Morada;
    private Integer telefone;
    private Double Salary;
    private Integer NSS;
    private Integer NIF;

    public BaseDados(Integer ID, String Nome ,String Morada, Integer telefone, Double Salary ,Integer NSS, Integer NIF) {
        this.ID = ID;
        this.Nome = Nome;
        this.Morada = Morada;
        this.telefone = telefone;
        this.Salary = Salary;
        this.NSS = NSS;
        this.NIF = NIF;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome) {
            this.Nome = Nome;
    }

    public String getMorada() {
       return Morada;
    }

    public void setMorada(String Morada) {
        this.Morada = Morada;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Integer getNSS() {
        return NSS;
    }

    public void setNSS(Integer NSS) {
            this.NSS = NSS;
    }

    public Integer getNIF() {
        return NIF;
    }

    public void setNIF(Integer NIF) {
                this.NIF = NIF;
    }
    
    public Double Salary() {
    	return Salary;
    }
    
    public void setSalary(Double Salary) {
    	this.Salary = Salary;
    }
    
    public void increaseSalary(double percentage) {
    	Salary += Salary * percentage / 100.0;
    }
    
    public String ListEmployee() {
    	return ID + ", " + Nome + ", " + String.format("%.2f",Salary);
    }
}
