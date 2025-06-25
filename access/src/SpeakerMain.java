public class SpeakerMain {


  public static void main(String[] args) {
    Speaker speaker = new Speaker(90);
    speaker.showVolume();

    speaker.volumeUp();
    speaker.showVolume();

    speaker.volumeUp();
    speaker.showVolume();

    System.out.println("volume 필드 직접 접근 수정");
    // speaker.volume = 200; // 컴파일 에러 발생, private 필드에 직접 접근 불가 / 컴파일 에러는 좋은 오류!
    speaker.showVolume();
  }
}
