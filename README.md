# 🥚 알깨기 알고리즘 스터디

> **알고리즘도 깨고, 성장의 껍질도 깨자!**

혼자서는 꾸준히 하기 어려운 알고리즘 공부를 함께하고, 문제 풀이와 코드 리뷰를 통해 꾸준히 성장하는 것을 목표로 합니다.

---

## 📖 목차

1. [스터디 소개](#-스터디-소개)
2. [스터디 목표](#-스터디-목표)
3. [진행 방식](#-진행-방식)
4. [저장소 구조](#-저장소-구조)
5. [브랜치 운영 방식](#-브랜치-운영-방식)
6. [처음 참여하는 방법](#-처음-참여하는-방법)
7. [매회 문제 제출 방법](#-매회-문제-제출-방법)
8. [Pull Request 작성 방법](#-pull-request-작성-방법)
9. [병합 후 브랜치 정리](#-병합-후-브랜치-정리)
10. [자주 발생하는 상황](#-자주-발생하는-상황)

---

## 🥚 스터디 소개

알깨기 알고리즘 스터디는 정해진 문제를 꾸준히 풀고, 풀이 과정을 공유하며 함께 성장하는 알고리즘 학습 모임입니다.

단순히 정답 코드를 제출하는 것에 그치지 않고, 다음 내용을 함께 연습합니다.

- 문제를 분석하고 해결 방법을 설계하는 과정
- 시간 복잡도와 공간 복잡도를 고려하는 습관
- 다른 사람의 풀이를 읽고 이해하는 능력
- Git과 GitHub를 활용한 협업 방식
- Pull Request와 코드 리뷰 경험

---

## 🎯 스터디 목표

- 매주 정해진 문제를 꾸준히 풉니다.
- 문제 풀이 과정을 설명할 수 있는 힘을 기릅니다.
- 다른 사람의 코드를 읽고 피드백하는 습관을 만듭니다.
- Git과 GitHub의 기본적인 협업 흐름을 익힙니다.
- 한 학기 동안 꾸준한 알고리즘 학습 기록을 남깁니다.

---

## 🗓 진행 방식

- 스터디는 **주 2회 제출**을 기본으로 합니다.
- 각 제출 회차마다 Pull Request를 생성합니다.
- 기기 변경, 추가 풀이, 수정 등으로 필요한 경우 추가 Pull Request를 생성할 수 있습니다.
- 문제 풀이 파일은 자신의 이름 폴더 안에 저장합니다.
- Pull Request가 병합되면 해당 브랜치는 삭제합니다.
- 다음 제출은 최신 `master` 브랜치에서 새로운 브랜치를 만들어 시작합니다.

예시:

```text
화요일 제출  → week01-gildong-01
목요일 제출  → week01-gildong-02
추가 제출    → week01-gildong-03
(요일에 상관 없이 -01부터 순차적으로 늘려가면 됩니다.)
```

---

## 📁 저장소 구조

저장소는 아래 구조를 사용합니다.

```text
repository
├─ README.md
├─ week01
│  ├─ gildong
│  │  ├─ SWEA_LV1_2047_신문헤드라인.java
│  │  └─ SWEA_LV1_2027_대각선출력하기.java
│  ├─ chulsu
│  │  └─ SWEA_LV1_1933_간단한N의약수.java
│  └─ younghee
│     └─ SWEA_LV1_2056_연월일달력.java
├─ week02
│  ├─ gildong
│  ├─ chulsu
│  └─ younghee
└─ ...
```

### 폴더 예시

본인의 이름이 `gildong`이고 1주 차 문제를 제출한다면 다음 위치에 파일을 저장합니다.

```text
week01/gildong/
```

다른 사람의 폴더는 수정하지 않습니다.

### 파일명 예시

SWEA 문제는 아래 형식을 사용합니다.

```text
SWEA_난이도_문제번호_문제이름.java
```

예시:

```text
SWEA_LV1_2047_신문헤드라인.java
SWEA_LV2_1926_간단한369게임.java
```

파일명에는 가능하면 공백을 사용하지 않습니다.

---

## 🌿 브랜치 운영 방식

이 스터디에서는 **개인 전용 브랜치를 계속 재사용하지 않습니다.**

각 Pull Request마다 최신 `master` 브랜치에서 새로운 브랜치를 생성합니다.

### 브랜치 이름

```text
week주차-이름-제출순번
```

예시:

```text
week01-gildong-01
week01-gildong-02
week01-gildong-03
week02-gildong-01
```

### 운영 흐름

```text
master 최신화
    ↓
새 브랜치 생성
    ↓
문제 풀이 및 커밋
    ↓
원격 저장소에 Push
    ↓
Pull Request 생성
    ↓
코드 리뷰
    ↓
Squash and merge
    ↓
브랜치 삭제
    ↓
다음 제출 시 새 브랜치 생성
```


---

## 🚀 처음 참여하는 방법

### 1. Git 설치 확인

터미널에서 다음 명령어를 입력합니다.

```bash
git --version
```

버전 정보가 표시되면 Git이 설치된 상태입니다.

---

### 2. 저장소 Clone

GitHub 저장소의 주소를 복사한 뒤 다음 명령어를 실행합니다.

```bash
git clone 저장소_URL
```

예시:

```bash
git clone https://github.com/ssafy-s16-c15/c15-algorithm.git
```

---

### 3. 저장소 폴더로 이동

```bash
cd 저장소이름
```

예시:

```bash
cd c15-algorithm
```

---

### 4. 현재 브랜치 확인

```bash
git branch
```

`master` 앞에 `*` 표시가 있으면 현재 `master` 브랜치에 있는 것입니다.

```text
* master
```

다른 브랜치에 있다면 다음 명령어로 이동합니다.

```bash
git switch master
```

---

### 5. 최신 내용 가져오기

```bash
git pull origin master
```

---

## 💻 매회 문제 제출 방법

아래 과정은 문제를 제출할 때마다 반복합니다.

### 1. `master` 브랜치로 이동

```bash
git switch master
```

---

### 2. 최신 `master` 가져오기

```bash
git pull origin master
```

새 브랜치를 만들기 전에 반드시 최신 상태로 업데이트합니다.

---

### 3. 제출용 브랜치 생성

첫 번째 제출이라면:

```bash
git switch -c week01-gildong-01
```

두 번째 제출이라면:

```bash
git switch -c week01-gildong-02
```

추가 제출이라면:

```bash
git switch -c week01-gildong-03
```

`gildong` 부분에는 자신의 이름 또는 GitHub 아이디를 작성합니다.

---

### 4. 현재 브랜치 확인

```bash
git branch
```

예시:

```text
  master
* week01-gildong-01
```

반드시 제출용 브랜치에서 작업합니다.

---

### 5. 문제 풀이 파일 작성

자신의 주차별 이름 폴더에 파일을 저장합니다.

```text
week01/gildong/SWEA_LV1_2047_신문헤드라인.java
```

폴더가 없다면 직접 생성합니다.

---

### 6. 변경된 파일 확인

```bash
git status
```

본인이 추가하거나 수정한 파일만 표시되는지 확인합니다.

---

### 7. 파일을 Staging Area에 추가

특정 파일만 추가하는 것을 권장합니다.

```bash
git add week01/gildong/SWEA_LV1_2047_신문헤드라인.java
```

본인 폴더 전체를 추가하려면:

```bash
git add week01/gildong
```

모든 변경사항을 한 번에 추가하는 명령어는 주의해서 사용합니다.

```bash
git add .
```

---

### 8. 커밋 생성

```bash
git commit -m "code: Week01 문제 풀이"
```

문제별로 나누어 커밋해도 됩니다.

```bash
git commit -m "code: SWEA 2047 신문 헤드라인"
```

```bash
git commit -m "code: SWEA 2027 대각선 출력하기"
```

---

### 9. 원격 저장소에 Push

Push하는 브랜치는 다음 명령어를 사용합니다.

```bash
git push origin week01-gildong-01
```


---

## 🔀 Pull Request 작성 방법

Push가 완료되면 GitHub 저장소로 이동합니다.

보통 상단에 다음과 같은 버튼이 표시됩니다.

```text
Compare & pull request
```

버튼이 표시되지 않는다면 `Pull requests` 메뉴에서 직접 생성합니다.

### 브랜치 설정 확인

```text
base: master
compare: week01-gildong-01
```

- `base`는 병합될 대상 브랜치입니다.
- `compare`는 자신이 작업한 브랜치입니다.

두 브랜치가 반대로 설정되지 않았는지 반드시 확인합니다.

---

### PR 제목

```text
[Week01] gildong 문제 풀이 1차
```

예시:

```text
[Week01] gildong 문제 풀이 2차
[Week02] chulsu 문제 풀이 1차
```

---

### 병합 방식

Pull Request는 **Squash and merge** 방식으로 병합합니다.

Squash and merge는 여러 커밋을 하나의 커밋으로 합쳐 `master` 브랜치에 반영합니다.

예시:

```text
code: SWEA 2047 풀이
code: SWEA 2027 풀이
docs: 설명 추가
```

위 커밋들이 병합되면 `master`에는 다음과 같이 하나의 커밋으로 기록될 수 있습니다.

```text
[Week01] gildong 문제 풀이 1차 (#12)
```

---

## 🧹 병합 후 브랜치 정리

Pull Request가 병합되면 GitHub에서 해당 원격 브랜치를 삭제합니다.

GitHub의 Pull Request 화면에서 다음 버튼을 클릭합니다.

```text
Delete branch
```

원격 브랜치를 삭제해도 병합된 코드는 `master`에 남아 있으므로 사라지지 않습니다.

### 로컬 브랜치 삭제

먼저 `master`로 이동합니다.

```bash
git switch master
```

최신 내용을 가져옵니다.

```bash
git pull origin master
```

병합이 완료된 로컬 브랜치를 삭제합니다.

```bash
git branch -d week01-gildong-01
```

이제 다음 제출용 브랜치를 생성합니다.

```bash
git switch -c week01-gildong-02
```

---

## ✍️ 커밋 및 PR 작성 규칙

### 커밋 메시지 형식

```text
종류: 내용
```

권장 종류:

| 종류 | 설명 |
|---|---|
| `code` | 문제 풀이 코드 추가 또는 수정 |
| `fix` | 잘못된 코드 수정 |
| `docs` | README 또는 설명 문서 수정 |
| `refactor` | 동작은 같지만 코드 구조 개선 |
| `add` | 추가 풀이 작성 |
| `chore` | 설정이나 기타 작업 |

예시:

```text
code: SWEA 2047 신문 헤드라인 풀이
fix: SWEA 1926 반복문 범위 수정
docs: Week01 풀이 설명 추가
refactor: 중복 조건문 정리
```


---

## 🧯 자주 발생하는 상황

### 1. `master`에서 작업해 버린 경우

아직 커밋하지 않았다면 새 브랜치를 생성합니다.

```bash
git switch -c week01-gildong-01
```

현재 변경사항은 새 브랜치로 함께 이동합니다.

그다음 정상적으로 커밋하고 Push합니다.

```bash
git add week01/gildong
git commit -m "code: Week01 문제 풀이"
git push -u origin week01-gildong-01
```

---

### 2. 브랜치 이름을 잘못 만든 경우

아직 Push하지 않았다면 로컬 브랜치 이름을 변경합니다.

```bash
git branch -m 올바른브랜치이름
```

예시:

```bash
git branch -m week01-gildong-01
```

---

### 3. Pull Request에 파일이 너무 많이 포함된 경우

먼저 변경된 파일을 확인합니다.

```bash
git status
```

커밋에 포함된 파일을 확인합니다.

```bash
git show --stat
```

다른 사람의 파일이나 관계없는 파일을 수정했다면 해당 변경사항을 되돌린 뒤 다시 커밋합니다.

작업 상황에 따라 복구 방법이 달라질 수 있으므로 임의로 강제 Push하지 말고 스터디원에게 먼저 공유합니다.

---

### 4. Push가 거절되는 경우

원격 브랜치에 다른 커밋이 있다면 먼저 가져옵니다.

```bash
git pull origin 현재브랜치이름
```

예시:

```bash
git pull origin week01-gildong-01
```

충돌이 없다면 다시 Push합니다.

```bash
git push
```

---

### 5. Merge Conflict가 발생한 경우

충돌이 발생한 파일에는 다음과 같은 표시가 나타납니다.

```text
<<<<<<< HEAD
현재 브랜치의 코드
=======
가져오려는 브랜치의 코드
>>>>>>> master
```

필요한 코드만 남기고 아래 충돌 표시를 모두 삭제합니다.

```text
<<<<<<< HEAD
=======
>>>>>>> master
```

수정 후 다시 커밋합니다.

```bash
git add 충돌을해결한파일
git commit -m "fix: merge conflict 해결"
git push
```

---

### 6. 첫 번째 PR 병합 후 추가 제출이 필요한 경우

병합된 브랜치를 다시 사용하지 않습니다.

최신 `master`에서 새로운 브랜치를 만듭니다.

```bash
git switch master
git pull origin master
git switch -c week01-gildong-02
```

추가 제출이라면 순번을 증가시킵니다.

```bash
git switch -c week01-gildong-03
```

---

### 7. 같은 PR에 문제를 추가하고 싶은 경우

Pull Request가 아직 병합되지 않았다면 같은 브랜치에서 작업을 이어갑니다.

```bash
git switch week01-gildong-01
```

파일 추가 후:

```bash
git add week01/gildong
git commit -m "code: SWEA 추가 문제 풀이"
git push
```

기존 Pull Request에 자동으로 반영됩니다.

---

### 8. 다른 사람의 코드를 참고하고 싶은 경우

코드를 읽는 것은 가능하지만, 다른 사람의 폴더에 직접 수정하거나 커밋하지 않습니다.

피드백은 해당 Pull Request의 리뷰 또는 댓글로 남깁니다.

---

## 🌱 함께 지켜요

- 정답 코드만 복사하지 않고 스스로 고민합니다.
- 풀이가 완벽하지 않아도 과정을 공유합니다.
- 서로 다른 풀이 방식을 존중합니다.
- 피드백은 구체적이고 친절하게 작성합니다.
- 꾸준히 참여하며 함께 성장합니다.

> 처음에는 Git과 알고리즘이 모두 어렵게 느껴질 수 있습니다.  
> 실수하더라도 함께 해결하면서 하나씩 익혀 나갑시다!
