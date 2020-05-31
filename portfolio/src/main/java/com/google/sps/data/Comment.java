// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.data;

import java.util.Date;

/** Class containing a comment. */
public final class Comment {

  private final String userID;  
  private Date submitTime;  
  private String comment;

  public Comment(String userID, String comment){
    this.userID = userID;
    this.comment = comment;
  }

  public Comment(String userID, Date submitTime, String comment) {
    this.userID = userID;
    this.submitTime = submitTime;
    this.comment = comment;
  }

  public String getUserID() {
    return userID;
  }

  public void setSubmitTime(Date submitTime){
      this.submitTime= submitTime;
  }

  public Date getSubmitTime() {
    return submitTime;
  }

  public String getComment() {
    return comment;
  }
}