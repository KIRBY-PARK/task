import java.util.ArrayList;

public class PorkKimchiData {
    public static void main(String[] args) {
        // 자료구조명
        String dataStructure = "List";

        // 메뉴
        String foodMenu = "돼지고기 김치찜";

        // 선언 + 생성
        ArrayList<String> stringRecipe = new ArrayList<String>();

        // 레시피 추가
        stringRecipe.add("1. 다진마늘 1T, 생강즙 1T, 맛술2T, 후추를 넣고 섞어서 밑간 소스를 만든 후 돼지고기에 고르게 발라준다.");
        stringRecipe.add("2. 진간장 1T, 고춧가루 1T, 간 마늘 1T, 생강즙 1T, 김칫국물 3T, 설탕 1T, 후추를 섞어 양념장을 만들고 다시마 우린 물 550ml을 준비한다.");
        stringRecipe.add("3. 다시마 우린물 : 조각 다시마 4장을 물 550ml에 넣고 최소 30~40분을 두면 완성!");
        stringRecipe.add("4. 신김치의 속을 털어낸 후 국물이 약간 있는 상태로 준비한다. (잎이 큰 김치 추천)");
        stringRecipe.add("5. 김치 위에 밑간해놓은 삼겹살을 올리고 돌돌돌 말아주면서 고기가 옆으로 빠지지 않게 싸주면 된다.");
        stringRecipe.add("6. 만들어진 돼지고기 김치말이를 냄비 안에 차곡차곡 쌓아서 넣어준다.");
        stringRecipe.add("7. 만들어진 돼지고기 김치말이를 냄비 안에 차곡차곡 쌓아서 넣어준다.");
        stringRecipe.add("8. 뚜껑을 덮고 중불에서 25~30분 푹 끓여준다.");
        stringRecipe.add("9. 양파와 대파, 청양고추를 어슷 썰어서 넣고 10분을 중약불에서 끓여준다.");

        // 주의사항
        String caution = "⚠\uFE0F 주의 ⚠\uFE0F \n 김치찜 요리는 센불에서 끓이면 맛이 안나기에 중불 ~ 중약불로 푹 끓이는게 Point! (인덕션이라면 4~5단계)";

        // 출력
        System.out.println("\uD83D\uDCE3 커비 강력추천!\n" + "[ " + dataStructure + "로 " + foodMenu + "] " + "만들기");
        for (int i = 0; i < stringRecipe.size(); i++) {
            System.out.println(stringRecipe.get(i));
        }
        System.out.println("\n" + caution);
    }
}
