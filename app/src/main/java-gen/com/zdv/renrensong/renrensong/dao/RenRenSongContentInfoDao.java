package com.zdv.renrensong.renrensong.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.zdv.renrensong.renrensong.RenRenSongContentInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "REN_REN_SONG_CONTENT_INFO".
*/
public class RenRenSongContentInfoDao extends AbstractDao<RenRenSongContentInfo, Long> {

    public static final String TABLENAME = "REN_REN_SONG_CONTENT_INFO";

    /**
     * Properties of entity RenRenSongContentInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Order_num = new Property(1, String.class, "order_num", false, "ORDER_NUM");
        public final static Property Order_id = new Property(2, String.class, "order_id", false, "ORDER_ID");
        public final static Property Sender_id = new Property(3, String.class, "sender_id", false, "SENDER_ID");
        public final static Property Organ_id = new Property(4, String.class, "organ_id", false, "ORGAN_ID");
        public final static Property G_time = new Property(5, String.class, "g_time", false, "G_TIME");
        public final static Property End_time = new Property(6, String.class, "end_time", false, "END_TIME");
        public final static Property Status = new Property(7, String.class, "status", false, "STATUS");
        public final static Property Item_name = new Property(8, String.class, "item_name", false, "ITEM_NAME");
        public final static Property Item_type = new Property(9, String.class, "item_type", false, "ITEM_TYPE");
        public final static Property Item_total = new Property(10, String.class, "item_total", false, "ITEM_TOTAL");
        public final static Property Item_weight = new Property(11, String.class, "item_weight", false, "ITEM_WEIGHT");
        public final static Property Item_volume = new Property(12, String.class, "item_volume", false, "ITEM_VOLUME");
        public final static Property Y_address = new Property(13, String.class, "y_address", false, "Y_ADDRESS");
        public final static Property Y_tel = new Property(14, String.class, "y_tel", false, "Y_TEL");
        public final static Property Y_name = new Property(15, String.class, "y_name", false, "Y_NAME");
        public final static Property H_address = new Property(16, String.class, "h_address", false, "H_ADDRESS");
        public final static Property H_tel = new Property(17, String.class, "h_tel", false, "H_TEL");
        public final static Property H_name = new Property(18, String.class, "h_name", false, "H_NAME");
        public final static Property Create_time = new Property(19, String.class, "create_time", false, "CREATE_TIME");
        public final static Property Finish_time = new Property(20, String.class, "finish_time", false, "FINISH_TIME");
        public final static Property R_status = new Property(21, String.class, "r_status", false, "R_STATUS");
        public final static Property S_status = new Property(22, String.class, "s_status", false, "S_STATUS");
        public final static Property Is_close = new Property(23, String.class, "is_close", false, "IS_CLOSE");
        public final static Property Is_back = new Property(24, String.class, "is_back", false, "IS_BACK");
        public final static Property Is_inventory = new Property(25, String.class, "is_inventory", false, "IS_INVENTORY");
        public final static Property Receiver_id = new Property(26, String.class, "receiver_id", false, "RECEIVER_ID");
        public final static Property Money = new Property(27, String.class, "money", false, "MONEY");
        public final static Property Pay_status = new Property(28, String.class, "pay_status", false, "PAY_STATUS");
        public final static Property C_type = new Property(29, String.class, "c_type", false, "C_TYPE");
        public final static Property Gathering_num = new Property(30, String.class, "gathering_num", false, "GATHERING_NUM");
        public final static Property Pay_type = new Property(31, String.class, "pay_type", false, "PAY_TYPE");
        public final static Property Order_type = new Property(32, String.class, "order_type", false, "ORDER_TYPE");
        public final static Property Remark = new Property(33, String.class, "remark", false, "REMARK");
        public final static Property S_id = new Property(34, String.class, "s_id", false, "S_ID");
        public final static Property Url = new Property(35, String.class, "url", false, "URL");
        public final static Property Distance = new Property(36, String.class, "distance", false, "DISTANCE");
        public final static Property IsShow = new Property(37, Boolean.class, "isShow", false, "IS_SHOW");
        public final static Property IsOperating = new Property(38, Boolean.class, "isOperating", false, "IS_OPERATING");
        public final static Property Activity_page = new Property(39, Integer.class, "activity_page", false, "ACTIVITY_PAGE");
        public final static Property Order_owner = new Property(40, String.class, "order_owner", false, "ORDER_OWNER");
    };


    public RenRenSongContentInfoDao(DaoConfig config) {
        super(config);
    }
    
    public RenRenSongContentInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"REN_REN_SONG_CONTENT_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"ORDER_NUM\" TEXT," + // 1: order_num
                "\"ORDER_ID\" TEXT," + // 2: order_id
                "\"SENDER_ID\" TEXT," + // 3: sender_id
                "\"ORGAN_ID\" TEXT," + // 4: organ_id
                "\"G_TIME\" TEXT," + // 5: g_time
                "\"END_TIME\" TEXT," + // 6: end_time
                "\"STATUS\" TEXT," + // 7: status
                "\"ITEM_NAME\" TEXT," + // 8: item_name
                "\"ITEM_TYPE\" TEXT," + // 9: item_type
                "\"ITEM_TOTAL\" TEXT," + // 10: item_total
                "\"ITEM_WEIGHT\" TEXT," + // 11: item_weight
                "\"ITEM_VOLUME\" TEXT," + // 12: item_volume
                "\"Y_ADDRESS\" TEXT," + // 13: y_address
                "\"Y_TEL\" TEXT," + // 14: y_tel
                "\"Y_NAME\" TEXT," + // 15: y_name
                "\"H_ADDRESS\" TEXT," + // 16: h_address
                "\"H_TEL\" TEXT," + // 17: h_tel
                "\"H_NAME\" TEXT," + // 18: h_name
                "\"CREATE_TIME\" TEXT," + // 19: create_time
                "\"FINISH_TIME\" TEXT," + // 20: finish_time
                "\"R_STATUS\" TEXT," + // 21: r_status
                "\"S_STATUS\" TEXT," + // 22: s_status
                "\"IS_CLOSE\" TEXT," + // 23: is_close
                "\"IS_BACK\" TEXT," + // 24: is_back
                "\"IS_INVENTORY\" TEXT," + // 25: is_inventory
                "\"RECEIVER_ID\" TEXT," + // 26: receiver_id
                "\"MONEY\" TEXT," + // 27: money
                "\"PAY_STATUS\" TEXT," + // 28: pay_status
                "\"C_TYPE\" TEXT," + // 29: c_type
                "\"GATHERING_NUM\" TEXT," + // 30: gathering_num
                "\"PAY_TYPE\" TEXT," + // 31: pay_type
                "\"ORDER_TYPE\" TEXT," + // 32: order_type
                "\"REMARK\" TEXT," + // 33: remark
                "\"S_ID\" TEXT," + // 34: s_id
                "\"URL\" TEXT," + // 35: url
                "\"DISTANCE\" TEXT," + // 36: distance
                "\"IS_SHOW\" INTEGER," + // 37: isShow
                "\"IS_OPERATING\" INTEGER," + // 38: isOperating
                "\"ACTIVITY_PAGE\" INTEGER," + // 39: activity_page
                "\"ORDER_OWNER\" TEXT);"); // 40: order_owner
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"REN_REN_SONG_CONTENT_INFO\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, RenRenSongContentInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String order_num = entity.getOrder_num();
        if (order_num != null) {
            stmt.bindString(2, order_num);
        }
 
        String order_id = entity.getOrder_id();
        if (order_id != null) {
            stmt.bindString(3, order_id);
        }
 
        String sender_id = entity.getSender_id();
        if (sender_id != null) {
            stmt.bindString(4, sender_id);
        }
 
        String organ_id = entity.getOrgan_id();
        if (organ_id != null) {
            stmt.bindString(5, organ_id);
        }
 
        String g_time = entity.getG_time();
        if (g_time != null) {
            stmt.bindString(6, g_time);
        }
 
        String end_time = entity.getEnd_time();
        if (end_time != null) {
            stmt.bindString(7, end_time);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(8, status);
        }
 
        String item_name = entity.getItem_name();
        if (item_name != null) {
            stmt.bindString(9, item_name);
        }
 
        String item_type = entity.getItem_type();
        if (item_type != null) {
            stmt.bindString(10, item_type);
        }
 
        String item_total = entity.getItem_total();
        if (item_total != null) {
            stmt.bindString(11, item_total);
        }
 
        String item_weight = entity.getItem_weight();
        if (item_weight != null) {
            stmt.bindString(12, item_weight);
        }
 
        String item_volume = entity.getItem_volume();
        if (item_volume != null) {
            stmt.bindString(13, item_volume);
        }
 
        String y_address = entity.getY_address();
        if (y_address != null) {
            stmt.bindString(14, y_address);
        }
 
        String y_tel = entity.getY_tel();
        if (y_tel != null) {
            stmt.bindString(15, y_tel);
        }
 
        String y_name = entity.getY_name();
        if (y_name != null) {
            stmt.bindString(16, y_name);
        }
 
        String h_address = entity.getH_address();
        if (h_address != null) {
            stmt.bindString(17, h_address);
        }
 
        String h_tel = entity.getH_tel();
        if (h_tel != null) {
            stmt.bindString(18, h_tel);
        }
 
        String h_name = entity.getH_name();
        if (h_name != null) {
            stmt.bindString(19, h_name);
        }
 
        String create_time = entity.getCreate_time();
        if (create_time != null) {
            stmt.bindString(20, create_time);
        }
 
        String finish_time = entity.getFinish_time();
        if (finish_time != null) {
            stmt.bindString(21, finish_time);
        }
 
        String r_status = entity.getR_status();
        if (r_status != null) {
            stmt.bindString(22, r_status);
        }
 
        String s_status = entity.getS_status();
        if (s_status != null) {
            stmt.bindString(23, s_status);
        }
 
        String is_close = entity.getIs_close();
        if (is_close != null) {
            stmt.bindString(24, is_close);
        }
 
        String is_back = entity.getIs_back();
        if (is_back != null) {
            stmt.bindString(25, is_back);
        }
 
        String is_inventory = entity.getIs_inventory();
        if (is_inventory != null) {
            stmt.bindString(26, is_inventory);
        }
 
        String receiver_id = entity.getReceiver_id();
        if (receiver_id != null) {
            stmt.bindString(27, receiver_id);
        }
 
        String money = entity.getMoney();
        if (money != null) {
            stmt.bindString(28, money);
        }
 
        String pay_status = entity.getPay_status();
        if (pay_status != null) {
            stmt.bindString(29, pay_status);
        }
 
        String c_type = entity.getC_type();
        if (c_type != null) {
            stmt.bindString(30, c_type);
        }
 
        String gathering_num = entity.getGathering_num();
        if (gathering_num != null) {
            stmt.bindString(31, gathering_num);
        }
 
        String pay_type = entity.getPay_type();
        if (pay_type != null) {
            stmt.bindString(32, pay_type);
        }
 
        String order_type = entity.getOrder_type();
        if (order_type != null) {
            stmt.bindString(33, order_type);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(34, remark);
        }
 
        String s_id = entity.getS_id();
        if (s_id != null) {
            stmt.bindString(35, s_id);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(36, url);
        }
 
        String distance = entity.getDistance();
        if (distance != null) {
            stmt.bindString(37, distance);
        }
 
        Boolean isShow = entity.getIsShow();
        if (isShow != null) {
            stmt.bindLong(38, isShow ? 1L: 0L);
        }
 
        Boolean isOperating = entity.getIsOperating();
        if (isOperating != null) {
            stmt.bindLong(39, isOperating ? 1L: 0L);
        }
 
        Integer activity_page = entity.getActivity_page();
        if (activity_page != null) {
            stmt.bindLong(40, activity_page);
        }
 
        String order_owner = entity.getOrder_owner();
        if (order_owner != null) {
            stmt.bindString(41, order_owner);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public RenRenSongContentInfo readEntity(Cursor cursor, int offset) {
        RenRenSongContentInfo entity = new RenRenSongContentInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // order_num
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // order_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // sender_id
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // organ_id
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // g_time
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // end_time
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // status
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // item_name
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // item_type
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // item_total
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // item_weight
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // item_volume
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // y_address
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // y_tel
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // y_name
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // h_address
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // h_tel
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // h_name
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // create_time
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // finish_time
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // r_status
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // s_status
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // is_close
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // is_back
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // is_inventory
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // receiver_id
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // money
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // pay_status
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // c_type
            cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30), // gathering_num
            cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31), // pay_type
            cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32), // order_type
            cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33), // remark
            cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34), // s_id
            cursor.isNull(offset + 35) ? null : cursor.getString(offset + 35), // url
            cursor.isNull(offset + 36) ? null : cursor.getString(offset + 36), // distance
            cursor.isNull(offset + 37) ? null : cursor.getShort(offset + 37) != 0, // isShow
            cursor.isNull(offset + 38) ? null : cursor.getShort(offset + 38) != 0, // isOperating
            cursor.isNull(offset + 39) ? null : cursor.getInt(offset + 39), // activity_page
            cursor.isNull(offset + 40) ? null : cursor.getString(offset + 40) // order_owner
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, RenRenSongContentInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setOrder_num(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setOrder_id(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSender_id(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setOrgan_id(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setG_time(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setEnd_time(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setStatus(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setItem_name(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setItem_type(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setItem_total(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setItem_weight(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setItem_volume(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setY_address(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setY_tel(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setY_name(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setH_address(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setH_tel(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setH_name(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setCreate_time(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setFinish_time(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setR_status(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setS_status(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setIs_close(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setIs_back(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setIs_inventory(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setReceiver_id(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setMoney(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setPay_status(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setC_type(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setGathering_num(cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30));
        entity.setPay_type(cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31));
        entity.setOrder_type(cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32));
        entity.setRemark(cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33));
        entity.setS_id(cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34));
        entity.setUrl(cursor.isNull(offset + 35) ? null : cursor.getString(offset + 35));
        entity.setDistance(cursor.isNull(offset + 36) ? null : cursor.getString(offset + 36));
        entity.setIsShow(cursor.isNull(offset + 37) ? null : cursor.getShort(offset + 37) != 0);
        entity.setIsOperating(cursor.isNull(offset + 38) ? null : cursor.getShort(offset + 38) != 0);
        entity.setActivity_page(cursor.isNull(offset + 39) ? null : cursor.getInt(offset + 39));
        entity.setOrder_owner(cursor.isNull(offset + 40) ? null : cursor.getString(offset + 40));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(RenRenSongContentInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(RenRenSongContentInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
