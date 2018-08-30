package com.baizhi.service;


import com.baizhi.dao.AlbumDao;
import com.baizhi.dao.ChapterDao;
import com.baizhi.entity.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AlbumServiceImpl implements AlbumService{
    @Autowired
    private AlbumDao albumDao;
    @Autowired
    private ChapterDao chapterDao;

    @Override
    public List<Album> selectAll() {

        List<Album> albumList= new ArrayList<Album>();
        List<Album> albums= albumDao.selectAll();

        for(int i=0 ; i<=albums.size()-1;i++){
            albums.get(i).setChildren(chapterDao.selectById(albums.get(i).getId()));
            albumList.add(i,albums.get(i));
        }

        return albumList;
    }

    /*查询单张专辑*/
    @Override
    public Album selectById(String id) {

       Album album = albumDao.selectById(id);
       album.setChildren(chapterDao.selectById(id));
       return album;
    }
}
