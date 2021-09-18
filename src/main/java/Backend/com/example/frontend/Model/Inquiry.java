package Backend.com.example.frontend.Model;

import org.springframework.data.annotation.Id;

public class Inquiry {

    public String searchName;
    public String searchEmail;
    public int searchNum;
    public String searchPass;

    public Inquiry(){

    }

    public Inquiry(String searchName, String searchEmail, int searchNum, String searchPass) {
        this.searchName = searchName;
        this.searchEmail = searchEmail;
        this.searchNum = searchNum;
        this.searchPass = searchPass;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public String getSearchEmail() {
        return searchEmail;
    }

    public void setSearchEmail(String searchEmail) {
        this.searchEmail = searchEmail;
    }

    public int getSearchNum() {
        return searchNum;
    }

    public void setSearchNum(int searchNum) {
        this.searchNum = searchNum;
    }

    public String getSearchPass() {
        return searchPass;
    }

    public void setSearchPass(String searchPass) {
        this.searchPass = searchPass;
    }
}
