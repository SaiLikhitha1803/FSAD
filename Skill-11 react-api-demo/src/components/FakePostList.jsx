import axios from "axios";
import { useEffect, useState } from "react";

function FakePostList(){

 const [posts,setPosts] = useState([]);

 const loadPosts = () => {

   axios.get("https://dummyjson.com/posts")
   .then(res => {
      setPosts(res.data.posts);
   })

 }

 useEffect(()=>{
   loadPosts();
 },[])

 return(

  <div>

   <h2>Fake API Posts</h2>

   <button onClick={loadPosts}>Refresh</button>

   {posts.map(post => (

    <div key={post.id}>
     <h4>{post.title}</h4>
     <p>{post.body}</p>
     <hr/>
    </div>

   ))}

  </div>

 )

}

export default FakePostList