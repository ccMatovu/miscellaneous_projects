import React from 'react'
import Modal from './Modal'
import Sidebar from './Sidebar'
import Home from './Home'
function App() {
  return (
    <>
      <h2>Prop Drilling</h2>
      <Home/>
      <Modal/>
      <Sidebar/>
    </>
  )
}

export default App
