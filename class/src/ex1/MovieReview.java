package ex1;

public class MovieReview {

  String title;
  String review;

  void displayReviewInfo() {
    System.out.printf("영화 제목: \"%s\", 리뷰: \"%s\"\n", this.title, this.review);
  }
}
