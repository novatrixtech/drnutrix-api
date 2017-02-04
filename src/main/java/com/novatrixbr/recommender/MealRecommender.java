package com.novatrixbr.recommender;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.IOException;
import java.util.List;

/**
 * Created by bruno on 2/3/17.
 */
public class MealRecommender {

    DataModel mealModel = new Data().getMealModel();

    Recommender recommender = new RecommendationBuilder().buildRecommender(mealModel);

    List<RecommendedItem> recommendations = recommender.recommend(1, 3);

//    for (RecommendedItem recomendation : recommendations) {
//        System.out.println(recomendation);
//    }

    public MealRecommender() throws IOException, TasteException {
    }
}
