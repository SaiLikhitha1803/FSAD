import { useEffect, useState } from "react";

function LocalUserList() {

  const [users,setUsers] = useState([]);
  const [loading,setLoading] = useState(true);

  useEffect(() => {

    fetch("/users.json")
      .then(res => res.json())
      .then(data => {
        setUsers(data);
        setLoading(false);
      })
      .catch(err => console.log(err));

  }, []);

  if(loading){
    return <h3>Loading Users...</h3>
  }

  return (
    <div>
      <h2>Local Users</h2>

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

export default LocalUserList