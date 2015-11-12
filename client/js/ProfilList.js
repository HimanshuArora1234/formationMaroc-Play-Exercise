import React, { PropTypes } from 'react';


export default class ProfilList extends React.Component {

  constructor(props) {
    super(props);

  }

  render() {
    return (
      <div>TODO</div>
    );
  }

  renderProfil(profil) {
    //TODO : function to render a profile data
  }

}

ProfilList.propTypes = {
  profils: PropTypes.array.isRequired
};
