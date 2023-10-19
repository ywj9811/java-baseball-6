## 목표 및 기능 목록

### 목표
- 숫자 야구 만들기
  - 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 낫싱
  - 3개의 숫자를 모두 맞추면 종료
  - 사용자의 입력에 따라 재시작 혹은 게임 종료

### 기능 목록

1. 컴퓨터가 숫자 자동 생성
   - 1~9까지 서로 다른 3개의 숫자를 자동으로 선택한다.
     - 다른 숫자인지 판별 후 같은 숫자이면 다시 선택 반복
2. 사용자가 숫자 입력
   - 서로 다른 3자리 숫자 입력
     - 만약 잘못된 값을 입력하는 경우 `IllegalArgumentException` 발생 후 종료
       - 숫자 0 혹은 숫자가 아닌 경우, 중복된 숫자의 경우 예외 발생
   - 게임 종료시 재시작/종료 구분하는 1,2 입력
     - 이외의 숫자 입력시 `IllegalArgumentException` 발생 후 종료
3. 결과 출력
   - 사용자 입력에 대한 결과를 볼, 스트라이크 개수 혹은 낫싱 표시
     - 위치가 다르지만 숫자가 존재하면 볼++
       - 이후 값 출력
     - 위치와 숫자가 모두 일치하면 스트라이크++
       - 이후 값 출력
     - 3가지 숫자가 모두 다르면 낫싱
       - 이후 값 출력
   - 사용자가 입력한 3개의 숫자가 모두 정답일 경우
     - 정답임을 출력
     - 재시작, 종료 안내
       - 이 경우에 2번의 재시작/종료 구분에 따른 예외 구현

## 커밋 컨벤션
**태그** : 제목의 형태이며, :뒤에만 space가 있도록 한다.

feat : 새로운 기능 추가

fix : 버그 수정

docs : 문서 수정

style : 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우

refactor : 코드 리펙토링

test : 테스트 코드, 리펙토링 테스트 코드 추가

chore : 빌드 업무 수정, 패키지 매니저 수정