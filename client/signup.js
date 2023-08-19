

// console.log("hello");

document.getElementById('submit-btn').addEventListener('click', (e) => {

  e.preventDefault()

 

 
const user_email = document.getElementById("email").value;
const user_password = document.getElementById("password").value;
const user_phoneno = document.getElementById("phoneno").value;
 

console.log(user_email);
console.log(user_phoneno);
console.log(user_password);
user={
  email:user_email,
  password:user_password,
  phoneno:user_phoneno
 }
 console.log(user);


  const xhr = new XMLHttpRequest()
  url = `http://localhost:8082/forms`
  xhr.open('POST', url)
  xhr.setRequestHeader('Access-Control-Allow-Origin','*')
  xhr.setRequestHeader('Content-Type', 'application/json')

  xhr.onreadystatechange = () => {
      if (xhr.readyState == 4 && xhr.status == 200) {
        document.location.href = 'http://localhost:5500/signin.html'
      }
  }


  xhr.send(JSON.stringify(user))


})









