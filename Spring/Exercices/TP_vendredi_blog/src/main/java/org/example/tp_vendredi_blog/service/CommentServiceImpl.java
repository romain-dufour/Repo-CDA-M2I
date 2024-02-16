package org.example.tp_vendredi_blog.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.tp_vendredi_blog.model.Comment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CommentServiceImpl implements ICommentService{

    private List<Comment> comments = new ArrayList<>();
    private Long currentCommentId = 1L;
    @Override
    public Comment createComment(Comment comment) {
        comment.setId(currentCommentId++);
        comments.add(comment);
        return comment;
    }

    @Override
    public Comment getCommentById(Long id) {
        return comments.stream().filter(comment -> comment.getId()
                .equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Comment> getAllComment() {
        return comments;
    }

    @Override
    public Comment updateComment(Long id, Comment updateComment) {
        Comment existingComment = getCommentById(id);
        if(existingComment != null){
            existingComment.setName(updateComment.getName());
            existingComment.setEmail(updateComment.getEmail());
            existingComment.setPost(updateComment.getPost());
            existingComment.setContent(updateComment.getContent());
        }
        return  existingComment;

    }

    @Override
    public void deleteComment(Long id) {
        comments.removeIf(comment -> comment.getId().equals(id));
    }
}
