# 🥚 알깨기 알고리즘 스터디

> **알고리즘도 깨고, 성장의 껍질도 깨자!**

혼자서는 꾸준히 하기 어려운 알고리즘 공부를 함께하고, 문제 풀이와 코드 공유를 통해 꾸준히 성장하는 것을 목표로 합니다.

---

## 📖 목차

1. [스터디 소개](#-스터디-소개)
2. [스터디 목표](#-스터디-목표)
3. [진행 방식](#-진행-방식)
4. [운영 규칙](#-운영-규칙)
5. [Repository 구조](#-repository-구조)
6. [파일명 규칙](#-파일명-규칙)
7. [브랜치 운영 방식](#-브랜치-운영-방식)
8. [Git과 GitHub 사용법](#-git과-github-사용법)
9. [Commit 규칙](#-commit-규칙)
10. [Pull Request 규칙](#-pull-request-규칙)
11. [코드 리뷰 규칙](#-코드-리뷰-규칙)
12. [Git 명령어 요약](#-git-명령어-요약)

---

## 🥚 스터디 소개

**알깨기**는 두 가지 의미를 담고 있습니다.

* 💻 **알고리즘을 깨다**: 다양한 문제를 해결하며 알고리즘 실력을 키웁니다.
* 🥚 **알을 깨다**: 성장의 껍질을 깨고 한 단계 더 발전합니다.

혼자 고민하는 시간을 줄이고, 함께 배우며 꾸준히 성장하는 것을 목표로 합니다.

| 항목     | 내용                         |
| ------ | -------------------------- |
| 첫 시작일  | 7월 23일 목요일                 |
| 진행 장소  | 온라인 Discord                |
| 진행 시간  | 매주 화요일, 목요일 22:00~23:00    |
| 진행 기간  | 1학기 종료까지, 프로젝트 주간 제외       |
| 문제 플랫폼 | SWEA                       |
| 문제 난이도 | SWEA D2~D3                 |
| 목표     | 꾸준한 문제 풀이 습관 형성 및 IM 등급 대비 |

---

## 🎯 스터디 목표

* 꾸준한 알고리즘 문제 풀이 습관 만들기
* SWEA D2~D3 수준의 문제에 익숙해지기
* 다양한 문제 풀이 방법 공유하기
* 코드 리뷰를 통해 더 좋은 풀이 방법 배우기
* IM 등급을 무난하게 통과할 수 있는 실력 만들기

---

## 📚 진행 방식

1. 지정된 문제를 스터디 시간 전까지 풉니다.
2. 자신의 개인 브랜치에 문제 풀이 파일을 업로드합니다.
3. 개인 브랜치에서 `master` 브랜치로 Pull Request를 생성합니다.
4. 스터디 시간에 각자의 풀이 방법을 공유합니다.
5. 서로 다른 접근 방법과 개선할 점을 함께 이야기합니다.
6. 남는 시간에는 자유롭게 추가 문제를 풉니다.

> **정답보다 문제를 끝까지 고민하는 과정을 더 중요하게 생각합니다.**

---

## 📌 운영 규칙

* 꾸준한 참여를 가장 중요하게 생각합니다.
* 문제를 풀지 못해도 괜찮지만, 반드시 시도는 해옵니다.
* 사정이 있어 참여하지 못할 경우 미리 알려주세요.
* 다른 사람의 풀이와 의견을 존중합니다.
* 모르는 부분은 자유롭게 질문합니다.
* 다른 사람의 코드를 그대로 복사하여 제출하지 않습니다.
* 이전 Pull Request가 병합된 후 다음 주차 작업을 시작합니다.

### 💰 벌금 제도

* 벌금은 모두 모아 회식비 또는 간식비로 사용합니다.
* 벌금 항목과 금액은 스터디 첫날 함께 정합니다.

---

## 📂 Repository 구조

주차별 폴더 안에 각자의 이름 폴더를 생성하고, 이름 폴더 안에 문제 풀이 파일을 저장합니다.

```text
Algorithm-Study
├── README.md
├── week01
│   ├── 홍길동
│   │   ├── SWEA_LV1_2047_신문헤드라인.java
│   │   └── SWEA_LV2_1926_간단한369게임.java
│   ├── 김철수
│   │   ├── SWEA_LV1_2047_신문헤드라인.java
│   │   └── SWEA_LV2_1926_간단한369게임.java
│   └── 이영희
│       └── SWEA_LV1_2047_신문헤드라인.java
├── week02
│   ├── 홍길동
│   ├── 김철수
│   └── 이영희
└── week03
    ├── 홍길동
    ├── 김철수
    └── 이영희
```

### 폴더 생성 예시

1주차에 홍길동이 문제를 푸는 경우 다음 경로에 파일을 저장합니다.

```text
week01/홍길동/SWEA_LV1_2047_신문헤드라인.java
```

2주차에는 새로운 주차 폴더 안에 자신의 이름 폴더를 생성합니다.

```text
week02/홍길동/
```

---

## 📄 파일명 규칙

파일명은 다음 형식을 사용합니다.

```text
플랫폼_난이도_문제번호_문제이름.java
```

### 예시

```text
SWEA_LV1_2047_신문헤드라인.java
SWEA_LV2_1926_간단한369게임.java
SWEA_LV3_1206_View.java
```

### 파일명 작성 규칙

* 플랫폼 이름은 `SWEA`로 작성합니다.
* 난이도는 `LV1`, `LV2`, `LV3` 형식으로 작성합니다.
* 문제번호를 반드시 포함합니다.
* 문제 이름의 띄어쓰기는 제거합니다.
* Java 파일의 확장자는 `.java`를 사용합니다.

---

## 🌿 브랜치 운영 방식

각 스터디원은 자신만의 개인 브랜치를 하나 생성하고 계속 사용합니다.

### 브랜치 이름

브랜치 이름은 자신의 이름 또는 GitHub 아이디를 사용합니다.

```text
honggildong
kimchulsu
leeyounghee
```

한글 이름보다 영문 이름이나 GitHub 아이디 사용을 권장합니다.

### 브랜치 구조 예시

```text
master
├── honggildong
├── kimchulsu
└── leeyounghee
```

개인 브랜치는 최초 한 번만 생성합니다.

매주 새로운 브랜치를 생성하지 않고, 자신의 개인 브랜치를 계속 사용합니다.

### 주의 사항

이전 주차 Pull Request가 병합되기 전에 다음 주차 파일을 같은 브랜치에 올리면, 기존 Pull Request에 다음 주차 작업까지 함께 포함될 수 있습니다.

따라서 반드시 다음 순서로 진행합니다.

```text
이전 Pull Request 병합 확인
        ↓
master 브랜치 최신화
        ↓
개인 브랜치에 master 반영
        ↓
새로운 주차 문제 풀이 시작
```

---

## 🚀 Git과 GitHub 사용법

## 1. Git 설치 확인

터미널 또는 Git Bash에서 다음 명령어를 입력합니다.

```bash
git --version
```

버전 정보가 출력되면 Git이 정상적으로 설치된 것입니다.

```text
git version 2.x.x
```

---

## 2. Repository Clone

Repository를 자신의 컴퓨터로 가져옵니다.

이 작업은 최초 한 번만 진행합니다.

```bash
git clone Repository_URL
```

예시:

```bash
git clone https://github.com/organization/algorithm-study.git
```

Clone이 완료되면 Repository 폴더로 이동합니다.

```bash
cd algorithm-study
```

현재 폴더의 파일을 확인합니다.

Windows:

```bash
dir
```

macOS 또는 Linux:

```bash
ls
```

---

## 3. 현재 브랜치 확인

```bash
git branch
```

현재 위치한 브랜치 앞에는 `*` 표시가 나타납니다.

```text
* master
```

---

## 4. 개인 브랜치 생성

개인 브랜치는 최초 한 번만 생성합니다.

먼저 `master` 브랜치로 이동합니다.

```bash
git switch master
```

최신 내용을 가져옵니다.

```bash
git pull origin master
```

개인 브랜치를 생성하면서 이동합니다.

```bash
git switch -c 브랜치이름
```

예시:

```bash
git switch -c honggildong
```

생성한 개인 브랜치를 원격 Repository에 처음으로 올립니다.

```bash
git push -u origin 브랜치이름
```

예시:

```bash
git push -u origin honggildong
```

`-u` 옵션을 사용하면 이후부터는 브랜치 이름을 생략하고 `git push`만 입력할 수 있습니다.

---

## 5. 매주 작업 시작 전 최신화

매주 문제 풀이를 시작하기 전에 `master` 브랜치의 최신 내용을 자신의 개인 브랜치에 반영해야 합니다.

### 5-1. master 브랜치로 이동

```bash
git switch master
```

### 5-2. 원격 master 브랜치의 최신 내용 가져오기

```bash
git pull origin master
```

### 5-3. 개인 브랜치로 이동

```bash
git switch honggildong
```

자신의 브랜치 이름으로 변경하여 사용합니다.

### 5-4. 최신 master 내용 병합

```bash
git merge master
```

이제 개인 브랜치에도 최신 `master` 브랜치의 내용이 반영됩니다.

---

## 6. 주차별 폴더와 이름 폴더 생성

예를 들어 1주차에 홍길동이 문제를 푸는 경우 다음 구조로 폴더를 생성합니다.

```text
week01/홍길동/
```

문제 풀이 파일은 해당 폴더 안에 저장합니다.

```text
week01/홍길동/SWEA_LV1_2047_신문헤드라인.java
```

다음 주에는 `week02` 폴더 안에 자신의 이름 폴더를 생성합니다.

```text
week02/홍길동/
```

---

## 7. 변경사항 확인

파일을 추가하거나 수정한 후 다음 명령어로 변경사항을 확인합니다.

```bash
git status
```

예시:

```text
Untracked files:
  week01/홍길동/SWEA_LV1_2047_신문헤드라인.java
```

---

## 8. 파일 추가

모든 변경 파일을 추가합니다.

```bash
git add .
```

특정 파일만 추가하려면 파일 경로를 입력합니다.

```bash
git add week01/홍길동/SWEA_LV1_2047_신문헤드라인.java
```

특정 폴더 전체를 추가할 수도 있습니다.

```bash
git add week01/홍길동/
```

파일이 정상적으로 추가되었는지 확인합니다.

```bash
git status
```

---

## 9. Commit

추가한 파일을 Commit합니다.

```bash
git commit -m "커밋 메시지"
```

예시:

```bash
git commit -m "feat: Week01 SWEA 문제 풀이"
```

한 문제씩 Commit하는 경우:

```bash
git commit -m "feat: SWEA 2047 신문헤드라인 풀이"
```

Commit은 현재까지의 작업 내용을 저장하는 과정입니다.

---

## 10. Push

Commit한 내용을 자신의 원격 개인 브랜치에 올립니다.

```bash
git push
```

최초 Push에서 `-u` 설정을 하지 않았다면 다음과 같이 입력합니다.

```bash
git push -u origin honggildong
```

Push가 완료되면 GitHub에서 자신의 브랜치를 확인할 수 있습니다.

---

## 11. Pull Request 생성

Push가 완료되면 GitHub Repository에 접속합니다.

GitHub 화면에 나타나는 **Compare & pull request** 버튼을 클릭합니다.

버튼이 나타나지 않는 경우 다음 순서로 진행합니다.

1. GitHub Repository의 `Pull requests` 메뉴를 클릭합니다.
2. `New pull request` 버튼을 클릭합니다.
3. `base` 브랜치를 `master`로 선택합니다.
4. `compare` 브랜치를 자신의 개인 브랜치로 선택합니다.

예시:

```text
base: master ← compare: honggildong
```

PR 제목과 내용을 작성한 후 `Create pull request` 버튼을 클릭합니다.

---

## 12. Pull Request 병합 후 다음 주 준비

Pull Request가 `master` 브랜치에 병합된 것을 확인합니다.

이후 로컬의 `master` 브랜치를 최신화합니다.

```bash
git switch master
git pull origin master
```

개인 브랜치로 이동합니다.

```bash
git switch honggildong
```

최신 `master` 내용을 개인 브랜치에 병합합니다.

```bash
git merge master
```

병합된 내용을 개인 원격 브랜치에도 반영합니다.

```bash
git push
```

이후 새로운 주차 폴더에서 다음 문제 풀이를 시작합니다.

```text
week02/홍길동/
```

---

## 13. 작업 도중 master 변경사항 반영하기

다른 사람의 Pull Request가 병합되어 `master` 브랜치가 변경된 경우, 다음 명령어로 최신 내용을 가져올 수 있습니다.

```bash
git switch master
git pull origin master
git switch honggildong
git merge master
```

개인 브랜치에서 직접 다음 명령어를 사용할 수도 있습니다.

```bash
git pull origin master
```

하지만 Git을 처음 사용하는 경우 현재 브랜치를 혼동할 수 있으므로, 아래 방법을 권장합니다.

```bash
git switch master
git pull origin master
git switch 개인브랜치
git merge master
```

---

## 💬 Commit 규칙

Commit 메시지는 작업 내용을 알기 쉽게 작성합니다.

### 기본 형식

```text
종류: 작업 내용
```

### Commit 종류

| 종류         | 설명              |
| ---------- | --------------- |
| `code`     | 새로운 문제 풀이 파일 추가 |
| `fix`      | 잘못된 코드 수정       |
| `add`      | 정답은 같지만 코드를 개선  |
| `docs`     | README 등 문서 수정  |
| `chore`    | 폴더 정리 등 기타 작업   |

### 예시

```text
code: Week01 SWEA 문제 풀이
code: SWEA 2047 신문헤드라인 풀이
fix: SWEA 1926 출력 오류 수정
add: SWEA 2047 반복문 개선
docs: README Git 사용법 수정
chore: 파일 위치 수정(week01->week02)
```

---

## 📬 Pull Request 규칙

### PR 제목

다음 형식을 사용합니다.

```text
[Week주차] 이름
```

예시:

```text
[Week01] 홍길동
[Week02] 김철수
```

---

## 🔄 Git Workflow

매주 다음 순서로 진행합니다.

```text
이전 Pull Request 병합 확인
              ↓
master 브랜치로 이동
              ↓
master 최신화
              ↓
개인 브랜치로 이동
              ↓
master 내용을 개인 브랜치에 병합
              ↓
주차별 이름 폴더에 문제 풀이 저장
              ↓
git add
              ↓
git commit
              ↓
git push
              ↓
개인 브랜치에서 master로 Pull Request 생성
              ↓
코드 리뷰 및 Merge
```

---

## 🧾 Git 명령어 요약

### 최초 한 번만 실행

```bash
git clone Repository_URL
cd Repository이름

git switch master
git pull origin master

git switch -c 개인브랜치
git push -u origin 개인브랜치
```

### 매주 작업 시작 전

```bash
git switch master
git pull origin master

git switch 개인브랜치
git merge master
```

### 문제 풀이 후

```bash
git status
git add .
git commit -m "feat: Week01 SWEA 문제 풀이"
git push
```

### Pull Request 병합 후

```bash
git switch master
git pull origin master

git switch 개인브랜치
git merge master
git push
```

---

## ⚠️ 자주 발생하는 상황

### 현재 브랜치를 확인하고 싶을 때

```bash
git branch
```

### 브랜치를 변경하고 싶을 때

```bash
git switch 브랜치이름
```

### 개인 브랜치를 처음 생성할 때

```bash
git switch -c 브랜치이름
```

### Commit할 파일이 없다고 나올 때

```text
nothing to commit, working tree clean
```

변경된 파일이 없거나 이미 Commit한 상태입니다.

다음 명령어로 상태를 확인합니다.

```bash
git status
```

### Push 전에 원격 변경사항이 있다고 나올 때

먼저 `master` 브랜치를 최신화한 후 개인 브랜치에 병합합니다.

```bash
git switch master
git pull origin master

git switch 개인브랜치
git merge master
git push
```

### Merge conflict가 발생했을 때

혼자 해결하기보다 스터디원에게 상황을 공유한 후 함께 해결합니다.

충돌을 해결한 뒤 다음 명령어를 실행합니다.

```bash
git add .
git commit -m "fix: merge conflict 해결"
git push
```

---


> **혼자 풀면 숙제, 함께 풀면 성장.**

🥚 **알깨기**에서 함께 알고리즘도 깨고, 성장의 껍질도 깨봅시다! 🚀
