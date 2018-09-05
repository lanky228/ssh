package liuzhengri.model.file.action;

import com.opensymphony.xwork2.ActionSupport;
import liuzhengri.model.file.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@Controller
public class FileAction extends ActionSupport {
    private Map result = new HashMap();
    @Autowired
    private IFileService fileService;

    public String test() throws Exception {
        result.put("data", "test data");
        result.put("data1", fileService.saveAndUpdate());
        return SUCCESS;
    }

    public Map getResult() {
        return result;
    }

    public void setResult(Map result) {
        this.result = result;
    }
}