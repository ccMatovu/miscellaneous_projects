import { useState,useEffect } from "react";




const useFetch = (url) =>{

const [data,setBlogs] = useState(null);
const [isPending,setIsPending] = useState(true);
const [error,setError] = useState(null);

    useEffect(()=>{
        setTimeout(()=>{
          fetch(url)
          .then(response => {
              if(!response.ok){
                  throw Error('could not fetch the data for that resource');
              }
              return response.json();
          }).then(data =>{
              setBlogs(data);
              setIsPending(false);
              setError(null);
          })
          .catch(err =>{
              setIsPending(false);
              setError(err.message);
          })
        },2000);
    },[url]);

    return { data, isPending, error};
}

export default useFetch;