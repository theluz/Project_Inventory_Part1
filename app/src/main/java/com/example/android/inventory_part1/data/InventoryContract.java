package com.example.android.inventory_part1.data;

import android.provider.BaseColumns;

public final class InventoryContract  {

    private InventoryContract(){}

    public static final class InventoryEntry implements BaseColumns{

        public final static String TABLE_NAME = "inventory";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PRODUCT_NAME = "name";
        public final static String COLUMN_PRODUCT_TYPE = "type";
        public final static String COLUMN_PRODUCT_PRICE = "price";
        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";
        public final static String COLUMN_SUPPLIER_NAME = "supplier";
        public final static String COLUMN_SUPPLIER_PHONE = "phone";

        public final static int TYPE_BOOK = 0;
        public final static int TYPE_MAGAZINE = 1;
        public final static int TYPE_OTHER = 2;
    }
}
