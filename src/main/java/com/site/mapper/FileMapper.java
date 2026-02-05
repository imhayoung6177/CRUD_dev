package com.site.mapper;

import com.site.domain.File;

import java.util.List;

public interface FileMapper {
    
    void save(File fileEntity);

    List<File> findFilesByBoardId(long bno);

    File findById(long fileId);

    // 첨부된 특정 파일 삭제
//    void deleteById(long id);

    void deleteByBoardId(long bno);
}
