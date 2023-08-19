

// console.log("hello");

document.getElementById('submit-btn').addEventListener('click', (e) => {
    e.preventDefault()
  
   
  const user_email = document.getElementById("email").value;
  const user_password = document.getElementById("password").value;
window.localStorage.setItem("myemail",user_email)

  console.log(user_email);
  console.log(user_password);
  user={
    email:user_email,
    password:user_password,
   }
   console.log(user);
  
  
    const xhr = new XMLHttpRequest()
    url = `http://localhost:8082/forms`
    xhr.open('GET', url)
    xhr.setRequestHeader('Access-Control-Allow-Origin','*')
    xhr.setRequestHeader('Content-Type', 'application/json')
  
    xhr.onreadystatechange = () => {
        if (xhr.readyState == 4 && xhr.status == 200) {
          res=JSON.parse(xhr.responseText)
          console.log(res);
          for (let i =0 ; i< res.length; i++)
          {
            if( res[i].email==user_email && res[i].password==user_password)
            {
          console.log("success");
          window.location.href="http://localhost:5500/index.html"
          break;
          }
          else
          {
            document.getElementById('messages').innerHTML="incorrect"
            console.log('incorrect')
          }

        }
      }
    }
  
    xhr.send()
  
  
  })
  
  
  
  
  
  
  
  
  