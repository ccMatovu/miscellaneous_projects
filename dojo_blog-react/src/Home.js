import { useState } from "react";
import BlogList from "./BlogList";

const Home = ()=>{
    let [blogs,setBlogs] = useState([
        { title: 'My new website', body: 'lorem ipsum...', author: 'mario', id: 1 },
        { title: 'Welcome party!', body: 'lorem ipsum...', author: 'yoshi', id: 2 },
        { title: 'Web dev top tips', body: 'lorem ipsum...', author: 'mario', id: 3 }
      ]);

      let handleDelete = (id) =>{
          let newBlogs = blogs.filter((blog)=> blog.id != id);
          setBlogs(newBlogs);
      };
    
    return (
        <div className='home'>
            <BlogList blogs={blogs} title={'The list of blogs'} handleDelete={handleDelete}></BlogList>
        </div>
    );
}

export default Home;