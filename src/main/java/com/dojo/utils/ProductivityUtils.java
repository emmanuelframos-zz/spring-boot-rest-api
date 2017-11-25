package com.dojo.utils;

import com.dojo.enums.Months;
import com.dojo.web.rest.v1.resource.ProductivityMonth;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class ProductivityUtils {

    private static Double [] productvityArray = {10d, 20d, 30d, 40d, 50d, 60d, 70d, 80d, 90d, 100d};

    public static List<ProductivityMonth> getProductivityMonths() {
        List<ProductivityMonth> productivityMonths = new ArrayList<>();

        for (Months month : Months.values()){
            int randomIndex = new Random().nextInt(productvityArray.length);

            ProductivityMonth productivityMonth = new ProductivityMonth();
            productivityMonth.setMonth(month);
            productivityMonth.setValue(productvityArray[randomIndex]);

            productivityMonths.add(productivityMonth);
        }

        return productivityMonths;
    }
}
