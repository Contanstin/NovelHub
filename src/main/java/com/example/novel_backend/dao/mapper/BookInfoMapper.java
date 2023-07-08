package com.example.novel_backend.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.novel_backend.dao.entity.BookInfo;
import com.example.novel_backend.dto.req.BookSearchReqDto;
import com.example.novel_backend.dto.resp.BookInfoRespDto;

import java.util.List;

/**
 * Novel Information Mapper Interface
 *
 * @author :Contanstin
 * @create 2023/6/22 0:33
 */
public interface BookInfoMapper extends BaseMapper<BookInfo> {

    /**
     * Book search
     * @param page mybatis-plus page Object
     * @param dto search condition
     * @return book result
     */
    List<BookInfo> searchBooks(IPage<BookInfoRespDto> page, BookSearchReqDto dto);
}
