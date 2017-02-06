package com.novatrixbr.recommender;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

import java.io.File;
import java.io.IOException;

/**
 * Created by bruno on 2/3/17.
 */
public class Data {

    public DataModel getMealModel() throws IOException, TasteException {
        return getDataModel("");
    }

    private DataModel getDataModel(String pathname) throws IOException {
        File file = new File(pathname);
        return new FileDataModel(file);
    }
}
