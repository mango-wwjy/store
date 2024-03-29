package com.shxt.modual.index.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shxt.modual.cart.model.Cart;
import com.shxt.modual.goods.model.Goods;
import com.shxt.modual.index.dao.IndexDao;
import com.shxt.modual.index.model.Index;
import com.shxt.modual.index.service.IndexService;

/**
 * 主页业务层实现类
 *
 * @author
 * @Version 1.0
 * @Copyright
 * @date  下午6:50:55
 * @description
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService {

    /** 数据访问层 */
    @Autowired
    private IndexDao indexDao;
    
    /**
     * 查看主页
     *
     * @author
     * @date  下午7:50:46
     * @return List<Index>
     */
    @Override
    public List<Goods> list() {
        return indexDao.list();
    }

    /**
     * 购物车信息
     *
     * @author
     * @date  下午7:50:46
     * @return List<Cart>
     */
    @Override
    public List<Cart> getCart(String c_id) {
        return indexDao.getCart(c_id);
    }
    
    /**
     * 根据主键查询主页
     *
     * @author
     * @date  下午6:14:37
     * @param id
     * @return Index
     */
    @Override
    public Index get() {
        return indexDao.get();
    }
    
}
