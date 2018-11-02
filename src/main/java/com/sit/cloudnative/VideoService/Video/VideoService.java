package com.sit.cloudnative.VideoService.Video;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {
    
    @Autowired
    VideoAdapter videoAdapter;
    
    public Video getVideoById(Long videoId){
        Video video = videoAdapter.getVideo(videoId);
        return video;
    }
}
