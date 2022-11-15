import React from "react";
import { Autocomplete } from "@react-google-maps/api";
import { AppBar, Toolbar, Typography, InputBase, Box } from "@material-ui/core";
import SearchIcon from '@material-ui/icons/Search';

const Header =() =>{
    return (<AppBar position = "static">
        <Toolbar className={classes.toobar}>
            <Typography variant ="h5" className={classes.title}>
                Travel Adisor
            </Typography>
            <Box display = "flex"></Box>
            <Typography variant="h6" className={classes.tille}>
                Explore new places
            </Typography>
            <Autocomplete>
                <div className={classes.search}>
                    <div className={classes.searchIcon}>
                        <SearchIcon/>
                    </div>
                    <InputBase placeholder="Search..." classes={{root: classes.inputRoot, input: classes.inputInput}} />
                </div>
            </Autocomplete>
        </Toolbar>
    </AppBar>);
}

export default Header;