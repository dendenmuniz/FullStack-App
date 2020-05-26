import React from "react";

function PostForm({onSubmit, errorMessage}) {
    const [body, setBody] = React.useState("");
    
    const [error, setError] = React.useState("");

    const handleSubmit = () => {
  
        // Invoke the passed in event callback
        onSubmit({body: body}).then(function (value){
            if(value !== true){
                setError(value);
            } else {
                // Clear the input field
                setBody("");
                setError("");
            }
        });
        
        
    };

    return ( 
        <div className="card">
            <div className="card-body">
                <h4 className="card-title" >What's on your mind?</h4>
                <div>
                    <div className="form-group">
                        <textarea 
                            className="form-control"
                            value={body}
                            onChange={e => setBody(e.target.value)} />
                    </div>


                    <div className="form-group">
                        <button 
                            className="btn btn-primary" 
                            onClick={handleSubmit}>
                            Post
                        </button>
                    </div>

                    <div className="form-group">
                    <p>{error}</p>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default PostForm;