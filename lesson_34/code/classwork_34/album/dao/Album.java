package classwork_34.album.dao;

import classwork_34.album.model.Photo;

import java.time.LocalDate;

public interface Album {

    int size();

    boolean addPhoto(Photo photo);
    boolean removePhoto(int photoId, int albumId);
    boolean upDatePhoto(int photoId,int albumId, String url);

    Photo getPhotoFromAlbum(int photoId, int albumId);
    Photo[] getAllPhotoFromAlbum(int albumId);
    Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo);


}
