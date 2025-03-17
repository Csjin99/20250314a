let member = [
    "최지원",
    "최지투",
    "최지삼",
    "최지사",
    "최지오",
    "최지육",
    "최지칠"
]

//push

console.log(member.push("구자철"));
console.log(member);

//splice(인덱스, 갯수)
console.log(member.splice(1,3));
console.log(member);

//slice(인덱스, 마지막인덱스-1)
console.log(member.slice(0,2));
console.log(member)

member = [
    "최지원",
    "최지투",
    "최지삼",
    "최지사",
    "최지오",
    "최지육",
    "최지칠"
]

//...배열 또는 ... 객체 -> spread연산자
//배열이나 객체의 요소를 개별적으로 펼쳐서 복사하거나 전달할 때 사용
let member2 = [
    ...member,
    "피카츄"
]

console.log(member2);

let choi = {
    name: "jiwon",
    age: 20,
    gender: "남"
}

//값을 추가하거나
choi = {
    ...choi,
    address : "경기도 광명시"
}

//값을 삭제할 때
choi = {
    ...choi,
    age: 13
}

//비구조할당
// 배열이나 객체에서 값을 추출할때 개별변수에 할당해서 추출하는 문법

member = [
    "최지원",
    "최지투",
    "최지삼",
]

const [cho, too, sam] = member;
console.log(too);

choi = {
    name: "jiwon",
    age: 20,
    gender: "남"
}


const {name, age} = choi;
console.log(name+ ", " + age);

const {name:username, age:userage} = choi;
console.log(username+ ", " + userage);

console.log("-------------------------------------");


//join() -> 배열을 문자열로 변경해줌
console.log(member.join());
console.log(member.join("/"));

//sort()
member2.sort(); //오른차순 정렬
console.log(member2);
member2.reverse();
console.log(member2);

let numbers = [1,9,7,5,3,2];
console.log(numbers);

//a,b를 비교한다.
//1) a를 b보다 나중에 정렬하고 싶다면(뒤에두고싶다면) 0보다 큰수를 반환
//2) a를 b보다 먼저 정렬하고 싶다면(앞에두려면) 0보다 작은 숫자를 반환
//3) 원래 순서유지 -> 0반환
numbers.sort(function(a,b){
    return a> b ? 1:-1; // 오름차순정렬
});

//map
//기존배열의 요소를 전부 반복하며넛
//return된 값으로 새로운 배열을 만들어주는함수
//기존배열에 이용해서 새로운 배영ㄹ을 만들떄 사용

let tmpMember = member2.map(m => m);


console.log(tmpMember);



console.log("-------------------------------------")


//filter
//return값이 false요소를 제외하고 trun인 요소만 가져오고 싶을때
//배열에서 특정값만 필터링하고싶을 떄 사용
let number2 = [1,6,7,9,10,15];
let tmp2 = [];


tmp2 = number2.filter((n) => n % 2 === 0);

//buyHistory = buyHistory.filter(h => h.userkey !==2);

//find()
//return되는 조건에 값이 true인 첫 요소를 반환
//모든요소가 조건에 부합하지 않는다면(undefind를 반환)
console.log(tmp2.find(n => n % 2 ===0));
console.log(userList.find(u => u.userkey == 2));

//findIndex()
//return되는 조건에 값이 true인 첫 인덱스를 반환
//모든요소가 조건에 부합하지 않는다면 -1을 반환함
console.log(tmp2.find(n => n % 2 ===0));
console.log(userList.find(u => u.userkey == 2));