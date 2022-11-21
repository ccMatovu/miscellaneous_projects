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
      <Grid container spacing={3} style={{ width: '100%' }}>
        <Grid item xs={12} md={4}>
          <List />
        </Grid>
        <Grid item xs={12} md={4}>
          <Map
            setCoordinates={setCoordinates}
            setBounds={setBounds}
            coordinates={coordinates}
          />
        </Grid>
      </Grid>
    </>
  )
}

export default App;
