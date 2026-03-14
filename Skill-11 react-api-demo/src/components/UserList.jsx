import { useEffect, useState } from "react";

function UserList(){

 const [users,setUsers] = useState([]);

 useEffect(()=>{

   fetch("https://jsonplaceholder.typicode.com/users")
   .then(res => res.json())
   .then(data => setUsers(data))

 },[])

 return(

   <div>

     <h2>Users API Data</h2>

     {users.map(user => (

       <div key={user.id}>
         <p>Name : {user.name}</p>
         <p>Email : {user.email}</p>
         <p>Phone : {user.phone}</p>
         <hr/>
       </div>

     ))}

   </div>

 )

}

export default UserList