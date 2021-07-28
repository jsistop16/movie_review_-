# movie_review_personal_project

영화리뷰앱
----------

#### 디자인 설명
  - 최상위 레이아웃 : linear layout
    * orientation : vertical
      + linearlayout(orientation: horizontal) 
        - A1(영화 포스터), A2(제목, 시청연령, 개봉일, 좋아요 싫어요 버튼)
        - A2에서는 다시 linearlayout(orientation: vertical)로 디자인
      + linearlayout(orientation: horizontal)
        - vertical linearlayout 3개 배치(layout_weight를 각각 1로 설정)
        - 3개의 linear layout
          * 누적관객수
          * 평점
          * 예매율
      + scroll view
        - 줄거리

#### 액티비티 설명
  - 좋아요, 싫어요 버튼
    * 터치했을 때 버튼의 색이 변하고(drawable을 background로 설정)
    * toast 메시지 띄우기(좋아요를 눌렀습니다./ 싫어요를 눌렀습니다.)
    
