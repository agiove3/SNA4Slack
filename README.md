[![Build Status](https://travis-ci.org/agiove3/SNA4Slack.svg?branch=master)](https://travis-ci.org/agiove3/SNA4Slack)

# SNA4Slack
## Network Analysis and Visualization for Slack Teams

### Description

This web application will allow users to visualize and analyze social networks built upon Slack conversations within public channels.
Source data will come from Slack export archives of open source projects, publicly available at http://slackarchive.io.

Social networks will have Slack’s team members as nodes and will vary according to which communication exchange is considered for edges. Among possible social networks, consider first a mention-based network in which edges are direct and represent mentions (@username) to call the attention of a team member. A weight might be assigned to represent the number of mentions. Another network might be a subscription-based network in which edges are drawn between all the team members who subscribe to the same Slack public channel. A weight might be assigned to represent the number of common subscribed channels.

Visualizations should provide a way to show the network graph, without node overlapping, using one or more layout algorithms.

The system might allow the user to set filters for pruning the graph by keeping only nodes and edges that satisfies filters conditions. For example, you might define thresholds for edge weights to visualize pruned graphs with edges removed if under the threshold and nodes removed if disconnected. When filtering is disabled, the whole graph will be set again as the visible view.

The system should provide the most common metrics for social network analysis (SNA), including metrics to assess the overall structure of the network (e.g., measures for density, path length, and overall connectedness), centrality metrics (e.g., degree for undirected graphs and indegree/outdegree for directed graphs) and metrics the assess the level of clustering within a network (e.g., clustering coefficient). SNA measures might be shown in tabular mode as well as decoration of network graphs. SNA measures might be also used as filters for pruning the graphs.
