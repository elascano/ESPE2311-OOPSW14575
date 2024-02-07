package ec.edu.espe.foodandrollorder.model;

import java.util.Date;

public class RatingsAndReviews {
    private int commentId;
    private Date commentDate;
    private String contentComments;

    public RatingsAndReviews(int commentId, Date commentDate, String contentComments) {
        this.commentId = commentId;
        this.commentDate = commentDate;
        this.contentComments = contentComments;
    }

    @Override
    public String toString() {
        return "RatingsAndReviews{" + "commentId=" + commentId + ", commentDate=" + commentDate + ", contentComments=" + contentComments + '}';
    }
    
    public void postComment(){
        
    }

    public void removeComment(){
        
    }
    
    public void addComment(){
        
    }
    
    public void addRating(){
        
    }
    
    public void removeRating(){
        
    }
    
    /**
     * @return the commentId
     */
    public int getCommentId() {
        return commentId;
    }

    /**
     * @param commentId the commentId to set
     */
    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    /**
     * @return the commentDate
     */
    public Date getCommentDate() {
        return commentDate;
    }

    /**
     * @param commentDate the commentDate to set
     */
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    /**
     * @return the contentComments
     */
    public String getContentComments() {
        return contentComments;
    }

    /**
     * @param contentComments the contentComments to set
     */
    public void setContentComments(String contentComments) {
        this.contentComments = contentComments;
    }

    

}
