// 함수 선언식
// function 키워드를 이용해서 선언
function add(num1, num2) {
    return num1 + num2
}
function addLog(num1, num2) {
    console.log(num1 + num2)
}

console.log(add(10, 20))
console.log(addLog(15, 15))

// 함수 표현식
// 표현식: 어떤 특정한 값으로 귀결되는 코드
// 변수를 선언하고, 해당 변수에 함수를 할당하는 방식
const subtract = function (num1, num2) {
    return num1 - num2
}
console.log(subtract(20, 10))

// 함수 인자 전달하기
// 1. 인자 기본값
const greeting = function(name = 'Anonymous') {
    return `Hi, ${name}`
}
console.log(greeting('Jeeho'))
console.log(greeting())

// 2. 매개변수와 인자의 갯수 불일치 허용
const divide = function (num1, num2) {
    return num1 / num2
}

console.log(divide())
console.log(divide(1))
console.log(divide(1, 2))
console.log(divide(1, 2, 3))


const windowAlerts = function() {
    window.alert()
    window.alert('로그인이 필요합니다.')
    window.alert('비밀번호가 맞지 않습니다.')
    window.alert('응모가 완료 되었습니다.')
}

const windowConfirm = function () {
    const doMove = window.confirm('아이템이 추가되었습니다. 장바구니로 이동하시겠습니까?')
    if (doMove) window.open('https://google.com')
}


const windowPrompt = function() {
    const todoDesc = window.prompt('새로운 할일')
    const todoExpire = window.prompt('언제까지')
    window.alert(`새로운 할일: ${todoDesc}, ${todoExpire} 까지`)
}

const headerElem = document.querySelector('header')
headerElem.innerText = 'JS Generated Header'
const newHeading = document.createElement('h1')
newHeading.innerText = 'JS Genrated Heading'
headerElem.appendChild(newHeading)