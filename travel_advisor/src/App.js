import React,{useEffect,useState} from "react";

import Header  from "./components/Header/Header";
import List from "./components/List/List";
import Map from "./components/Map/Map";
import {CssBaseline, Grid} from '@material-ui/core';
import {getPlacesData} from "./api";

function App() {
  const [places,setPlaces] = useState([]);

  const [coordinates,setCoordinates] = useState({});
  const [bounds,setBounds] = useState(null);
  useEffect(()=>{
    getPlacesData()
      .then((data)=>{
        setPlaces(data);
        console.log('the places are 2 = ', data)

      });
  },[]);
  return (
    <>
      <CssBaseline />
      <Header />
        <Map/>
    </>
  )
}

export default App;
