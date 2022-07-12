package kosterror.shift.repository;

import kosterror.shift.model.entity.PostLikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface PostLikeRepository extends JpaRepository<PostLikeEntity, Long> {
    ArrayList<PostLikeEntity> getPostLikeEntitiesByPostId(Long id);
}