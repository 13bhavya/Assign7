package Backend.com.example.frontend;

import Backend.com.example.frontend.Model.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FormService {


    public List<Form> postData(String watchName,String watchEmail,Integer watchNum,String watchPass) {

        List<Form> forms = new ArrayList<>();

        Form form = new Form(1, watchName, watchEmail, watchNum, watchPass);

        forms.add(form);

        return forms;
    }
}

