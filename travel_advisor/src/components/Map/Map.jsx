import React from 'react'
import GoogleMapReact from 'google-map-react'
import { Paper, Typography, useMediaQuery } from '@material-ui/core'
import Rating from '@material-ui/lab'
import { LocationOnOutlined } from '@material-ui/icons/LocationOnOutlined'

import makeStyles from './styles'

const Map = () => {
  const isMobile = useMediaQuery('(min-width:600px)')
  const coordinates = { lat: 0, lng: 0 }
  const classes = makeStyles()
  return (
    <div className={classes.mapContainer}>
      Map
      <GoogleMapReact
        bootstrapURLKeys={{ key: 'AIzaSyAsRhrnYxNcZO-o0WKROEPimDh4UkWh7EI' }}
        defaultCenter={coordinates}
        center={coordinates}
        defaultZoom={14}
        margin={[50, 50, 50, 50]}
        options={''}
        onChange={''}
        onChildClick={''}
      ></GoogleMapReact>
    </div>
  )
}

export default Map
