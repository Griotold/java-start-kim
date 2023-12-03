package basic.class1.ex;
// 영화 제목: "인셉션", 리뷰: "인생은 무한 루프"
// 영화 제목: "어바웃 타임", 리뷰: "인생 시간 영화!"
public class MovieReviewMain {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview inception = createMovieReview("인셉션", "인생은 무한 루프");
        MovieReview aboutTime = createMovieReview("어바웃 타임", "인생 시간 영화");

        MovieReview[] reviews = {inception, aboutTime};

        // 영화 리뷰 정보 출력
        for (MovieReview review : reviews) {
            System.out.printf("영화 제목: %s, 영화 리뷰: %s", review.title, review.review);
            System.out.println();
        }


    }

    private static MovieReview createMovieReview(String title, String review) {
        MovieReview movieReview = new MovieReview();
        movieReview.title = title;
        movieReview.review = review;
        return movieReview;
    }
}
