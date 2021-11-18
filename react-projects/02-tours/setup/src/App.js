import React, { useState, useEffect } from 'react'
import Loading from './Loading'
import Tours from './Tours'
// ATTENTION!!!!!!!!!!
// I SWITCHED TO PERMANENT DOMAIN
const url = 'https://course-api.com/react-tours-project'
function App() {
  const [Loading,setLoading] = useState(true);
  const [tours,setTours] = useState([]);
  if(Loading){
  return(
   <main>
     <Loading/>
   </main>
  );
  }
  return(
    <main>
      <Tours/>
    </main>
  );
}

export default App
