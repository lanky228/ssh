package liuzhengri.model.file.service.impl;

import liuzhengri.dao.IUtilDao;
import liuzhengri.model.file.entity.FileEntity;
import liuzhengri.model.file.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service("fileService")
public class FileService implements IFileService {
    @Autowired
    IUtilDao utilDao;

    @Override
    public FileEntity saveAndUpdate() throws Exception {
        FileEntity db = utilDao.select(1L, FileEntity.class);
        if(db == null){
            FileEntity file = new FileEntity(1L, "testName" + new Date().toString());
            utilDao.save(file);
            db = file;
        }
        return db;
    }
}
