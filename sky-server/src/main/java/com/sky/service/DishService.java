package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface DishService {
    /**
     * 新增菜品和对应口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);

    /**
     * 分页查询
     * @param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 批量删除
     * @param ids
     */
    void delete(List<Long> ids);

    /**
     * 根据ID查询菜品和口味
     * @param id
     * @return
     */
    DishVO getByIdNFlavor(Long id);

    /***
     * 修改菜品
     * @param dishDTO
     */
    void updateWithFlavor(DishDTO dishDTO);

    /**
     * 起售停售菜品
     * @param status
     * @param id
     */
    void updateStatus(Integer status, long id);
}
