package com.example.network.remote.response

import com.example.domain.users.model.UserRepos

data class UserReposResponse(
    val allow_forking: Boolean? = null, // true
    val archive_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/{archive_format}{/ref}
    val archived: Boolean? = null, // false
    val assignees_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/assignees{/user}
    val blobs_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/git/blobs{/sha}
    val branches_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/branches{/branch}
    val clone_url: String? = null, // https://github.com/pjhyett/auto_migrations.git
    val collaborators_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/collaborators{/collaborator}
    val comments_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/comments{/number}
    val commits_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/commits{/sha}
    val compare_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/compare/{base}...{head}
    val contents_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/contents/{+path}
    val contributors_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/contributors
    val created_at: String? = null, // 2008-03-16T00:44:24Z
    val default_branch: String? = null, // master
    val deployments_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/deployments
    val description: String? = null, // Rails plugin for automating migrations
    val disabled: Boolean? = null, // false
    val downloads_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/downloads
    val events_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/events
    val fork: Boolean? = null, // false
    val forks: Int? = null, // 45
    val forks_count: Int? = null, // 45
    val forks_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/forks
    val full_name: String? = null, // pjhyett/auto_migrations
    val git_commits_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/git/commits{/sha}
    val git_refs_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/git/refs{/sha}
    val git_tags_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/git/tags{/sha}
    val git_url: String? = null, // git://github.com/pjhyett/auto_migrations.git
    val has_discussions: Boolean? = null, // false
    val has_downloads: Boolean? = null, // true
    val has_issues: Boolean? = null, // true
    val has_pages: Boolean? = null, // true
    val has_projects: Boolean? = null, // true
    val has_wiki: Boolean? = null, // true
    val homepage: String? = null, // http://errtheblog.com/posts/65-automatically
    val hooks_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/hooks
    val html_url: String? = null, // https://github.com/pjhyett/auto_migrations
    val id: Int? = null, // 4061
    val is_template: Boolean? = null, // false
    val issue_comment_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/issues/comments{/number}
    val issue_events_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/issues/events{/number}
    val issues_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/issues{/number}
    val keys_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/keys{/key_id}
    val labels_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/labels{/name}
    val language: String? = null, // Ruby
    val languages_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/languages
    val license: LicenseResponse? = null,
    val merges_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/merges
    val milestones_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/milestones{/number}
    val mirror_url: Any? = null, // null
    val name: String? = null, // auto_migrations
    val node_id: String? = null, // MDEwOlJlcG9zaXRvcnk0MDYx
    val notifications_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/notifications{?since = null,all = null,participating}
    val open_issues: Int? = null, // 1
    val open_issues_count: Int? = null, // 1
    val owner: OwnerResponse? = null,
    val `private`: Boolean? = null, // false
    val pulls_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/pulls{/number}
    val pushed_at: String? = null, // 2013-04-25T20:41:57Z
    val releases_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/releases{/id}
    val size: Int? = null, // 118
    val ssh_url: String? = null, // git@github.com:pjhyett/auto_migrations.git
    val stargazers_count: Int? = null, // 146
    val stargazers_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/stargazers
    val statuses_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/statuses/{sha}
    val subscribers_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/subscribers
    val subscription_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/subscription
    val svn_url: String? = null, // https://github.com/pjhyett/auto_migrations
    val tags_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/tags
    val teams_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/teams
    val topics: List<Any?>? = null,
    val trees_url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations/git/trees{/sha}
    val updated_at: String? = null, // 2023-03-03T12:23:57Z
    val url: String? = null, // https://api.github.com/repos/pjhyett/auto_migrations
    val visibility: String? = null, // public
    val watchers: Int? = null, // 146
    val watchers_count: Int? = null, // 146
    val web_commit_signoff_required: Boolean? = null // false
) {
    fun toUsersRepos(): UserRepos = UserRepos(
    allow_forking ?: true, // true
    archive_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/{archive_format}{/ref}
    archived ?: false, // false
    assignees_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/assignees{/user}
    blobs_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/git/blobs{/sha}
    branches_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/branches{/branch}
    clone_url ?: "", // https://github.com/pjhyett/auto_migrations.git
    collaborators_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/collaborators{/collaborator}
    comments_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/comments{/number}
    commits_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/commits{/sha}
    compare_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/compare/{base}...{head}
    contents_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/contents/{+path}
    contributors_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/contributors
    created_at ?: "", // 2008-03-16T00:44:24Z
    default_branch ?: "", // master
    deployments_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/deployments
    description ?: "", // Rails plugin for automating migrations
    disabled ?: false, // false
    downloads_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/downloads
    events_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/events
    fork ?: false, // false
    forks ?: 45, // 45
    forks_count ?: 45, // 45
    forks_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/forks
    full_name ?: "", // pjhyett/auto_migrations
    git_commits_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/git/commits{/sha}
    git_refs_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/git/refs{/sha}
    git_tags_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/git/tags{/sha}
    git_url ?: "", // git://github.com/pjhyett/auto_migrations.git
    has_discussions ?: false, // false
    has_downloads ?: true, // true
    has_issues ?: true, // true
    has_pages ?: true, // true
    has_projects ?: true, // true
    has_wiki ?: true, // true
    homepage ?: "", // http://errtheblog.com/posts/65-automatically
    hooks_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/hooks
    html_url ?: "", // https://github.com/pjhyett/auto_migrations
    id ?: 4061, // 4061
    is_template ?: false, // false
    issue_comment_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/issues/comments{/number}
    issue_events_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/issues/events{/number}
    issues_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/issues{/number}
    keys_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/keys{/key_id}
    labels_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/labels{/name}
    language ?: "", // Ruby
    languages_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/languages
    license?.toLicenseResponse(),
    merges_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/merges
    milestones_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/milestones{/number}
    mirror_url, // null
    name ?: "", // auto_migrations
    node_id ?: "", // MDEwOlJlcG9zaXRvcnk0MDYx
    notifications_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/notifications{?since = null,all = null,participating}
    open_issues ?: 1, // 1
    open_issues_count ?: 11, // 1
    owner?.toOwner(),
        private ?: false,
    pulls_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/pulls{/number}
    pushed_at ?: "", // 2013-04-25T20:41:57Z
    releases_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/releases{/id}
    size ?: 118, // 118
    ssh_url ?: "", // git@github.com:pjhyett/auto_migrations.git
    stargazers_count ?: 146, // 146
    stargazers_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/stargazers
    statuses_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/statuses/{sha}
    subscribers_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/subscribers
    subscription_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/subscription
    svn_url ?: "", // https://github.com/pjhyett/auto_migrations
    tags_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/tags
    teams_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/teams
    topics ?: emptyList(),
    trees_url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations/git/trees{/sha}
    updated_at ?: "", // 2023-03-03T12:23:57Z
    url ?: "", // https://api.github.com/repos/pjhyett/auto_migrations
    visibility ?: "", // public
    watchers ?: 146, // 146
    watchers_count ?: 146, // 146
    web_commit_signoff_required ?: false // false
    )
}